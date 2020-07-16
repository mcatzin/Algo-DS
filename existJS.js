/*
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example:

board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
*/


var exist = function (board, word) {
    if (board.length === 0 || word.length === 0) return false;

    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[0].length; j++) {
            if (dfs(board, i, j, word)) {
                return true;
            }
        }
    }

    return false;
};

const dfs = function (board, i, j, remain) {
    if (remain.length === 0) return true;
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
    if (board[i][j] !== remain[0]) return false;

    let char = board[i][j];
    board[i][j] = '-';
    let result = (dfs(board, i + 1, j, remain.substring(1)) ||
        dfs(board, i - 1, j, remain.substring(1)) ||
        dfs(board, i, j + 1, remain.substring(1)) ||
        dfs(board, i, j - 1, remain.substring(1)))
    board[i][j] = char;

    return result;
}