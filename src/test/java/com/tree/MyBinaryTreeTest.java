package com.tree;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void givenThreeNumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(3, size);
    }
}
