// Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

// For example:
// Given binary tree [3,9,20,null,null,15,7],
//     3
//    / \
//   9  20
//     /  \
//    15   7
// return its bottom-up level order traversal as:
// [
//   [15,7],
//   [9,20],
//   [3]
// ]


var levelOrderBottom = function (root) {
    return next(root ? [root] : [], []);
};

function next(nodes, arr) {
    if (nodes.length === 0) return arr;
    const vals = [],
        newNodes = [];
    for (let node of nodes) {
        vals.push(node.val);
        node.left && newNodes.push(node.left);
        node.right && newNodes.push(node.right);
    }
    arr.unshift(vals);
    return next(newNodes, arr);
}