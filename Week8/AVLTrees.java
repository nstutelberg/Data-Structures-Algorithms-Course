package Week8;

/*
Tree 1:
    Starting point. Note that the heights are unbalanced. (31|89 -> 4 and 2)
    In Tree 1, the balance factor at node 31 is -2 because the left subtree's height is 2
    and the right subtree's height is 4. A balance factor of -2 implies that the tree is left-heavy, which necessitates a right rotation.
         71
       /    \
      31     89
     / \     / \
    17  53  77  91
   /    / \
  7    41  55
             \
              69

Tree 2:
    After rotating around 31. This is meant to make the left tree left heavy because it is the only way to balance the tree when you rotate around the root node.
    After this first rotation, (53|89 -> 4 and 2), so still unbalanced, but then next rotation will balance it, because the inside children nodes (55 and 69)
    will be moved to the right side of the tree, and then 31 will then have a height of 3, and 71 will have a height of 3
         71
       /    \
      53     89
     / \     / \
    31  55  77  91
   / \    \
  17  41   69
 /
7
Tree 3:
    Rotating right around 71 (the root node). Now the heights are all balanced and all heights are within 1 of each other.
    By performing the second rotation (around 71), the tree becomes balanced. Every node now has a balance factor of -1, 0, or 1, which are acceptable balance factors for an AVL tree.
    Note that the inside children nodes were moved to the right tree, and are now the inside nodes of the right tree

         53
       /    \
     31       71
    / \     /    \
  17  41   55     89
 /          \     / \
7            69  77 91

Why the double rotation was needed -> why we first needed to rotate around 31 first

    The point of the first rotation (around 31) was to fix the local imbalance at 31. However, it caused a higher-level imbalance at the root, which was then corrected by the second rotation
    (around 71). This two-step rotation process is called a "double rotation," and it's a common technique to balance AVL trees when a single rotation is not sufficient.

    The imbalance is at node 71. However, simply rotating around node 71 wouldn't solve the imbalance due to the left-heavy subtree rooted at 31 also being right-heavy because of the 53 node.
    This means that a single rotation at 71 would not solve the overall imbalance.

    This is a classic scenario where a "double rotation" is needed. A double rotation comprises two individual rotations:

    The first rotation (around node 31) is to change the shape of the tree so that a subsequent rotation at the originally imbalanced node (71) will work.
    The second rotation (around node 71) balances the entire tree.
    By doing the first rotation around node 31, the subtree rooted at 31 changes shape such that the subsequent rotation at 71 can balance the entire tree.

    This double rotation technique ensures that the AVL tree properties are maintained. Your professor's decision to first rotate around 31 is in line with this standard AVL tree
    balancing technique.

 EX: If you did a right rotation right away and didn't rotate around 31 to make the tree left-heavy, then you would get the same issue but now the right side is heavy
 (17|71) in this case would be 2 and 4, which is the same issue as before. But if you do the left rotation in step 2 to make the tree left heavy in the left branch, then when you rotate right
 you will be able to keep the tree balanced
 --original--
         71
       /    \
      31     89
     / \     / \
    17  53  77  91
   /    / \
  7    41  55
             \
              69
--rotated around the root--
         31
       /    \
     17      71
    /       /   \
   7      53     89
         / \     / \
        41  55  77  91
              \
               69

*/

public class AVLTrees {
}
