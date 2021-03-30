package basicProject;



class node {
    int data;
    node left;
    node right;

    node(int data) {
        this.data = data;
    }

}
public class BinarySearchTree {
	int count=0;
    node root;
    public void insert(int data) {
        node newNode = new node(data);

        if (root == null) {
            root = newNode;
            return;
        }
        node tempNode = root;
        while (true) {

            if (newNode.data < tempNode.data) {
                if (tempNode.left == null) {
                    tempNode.left = newNode;
                    return;
                }
                tempNode = tempNode.left;
            } else {
                if (tempNode.right == null) {
                    tempNode.right = newNode;
                    return;
                }
                tempNode = tempNode.right;
            }
        }
    }

    public void lookup(int data) {
        if (root == null) {
            System.out.println("No nodes in the tree");
            return;
        }

        node currentNode = root;

        while (true) {
            if (currentNode.data == data) {
                System.out.println(currentNode.data);
                return;
            } else if (currentNode.data > data) {
                if (currentNode.left != null) {
                    currentNode = currentNode.left;
                } else {
                    System.out.println("Node is not presnt!!");
                    return;
                }
            } else {
                if (currentNode.right != null) {
                    currentNode = currentNode.right;
                } else {
                    System.out.println("Node is not presnet!!");
                    return;
                }
            }

        }

    }

    public void delete(int data) {
        if (root == null) {
            System.out.println("Tree is Empty");
            return;
        }

        node currentNode = root;
        node parentNode = null;

        while (true) {
            if (currentNode.data == data) {

                //If the node has two child
                if (currentNode.left != null && currentNode.right != null) { 
                	node lMax = getMax(currentNode.left);
                	node tempNode = currentNode;
                	currentNode = lMax;
                	lMax = null;
                	parentNode.left = currentNode;
                	currentNode.left = tempNode.left;
                	currentNode.right = tempNode.right;
                	 
                	
                	return;
                }
                //If the node has only one child
                else if (currentNode.left != null || currentNode.right != null) {

                    if (currentNode == root) {
                        System.out.println("Reached Here");
                        if (currentNode.left != null) {
                            System.out.println("Reached Here");
                            root = currentNode.left;
                        } else {
                            root = currentNode.right;
                        }
                        currentNode = null;

                        return;
                    }

                    if (data < parentNode.data) {
                        if (currentNode.left != null) {
                            parentNode.left = currentNode.left;
                        } else {
                            parentNode.left = currentNode.right;
                        }
                    } else {
                        if (currentNode.left != null) {
                            parentNode.right = currentNode.left;
                        } else {
                            parentNode.right = currentNode.right;
                        }
                    }
                    return;
                } else {
   
                    if (currentNode == root) {
                        System.out.println("Deleting the root node");
                        root = null;
                    }

                    if (parentNode.left.data == data) {
                        parentNode.left = null;
                    } else {
                        parentNode.right = null;
                    }

                    return;
                }

            } else if (data < currentNode.data) {

                if (currentNode.left == null) {
                    System.out.println("Node not present!!");
                    return;
                }
                //System.out.println("Reached here!!");
                parentNode = currentNode;
                currentNode = currentNode.left;
            } else {
                if (currentNode.right == null) {
                    System.out.println("Node not present!!");
                    return;
                }
                parentNode = currentNode;
                currentNode = currentNode.right;
            }
        }

    }

    //get maximum from left sub tree

    node getMax(node currentNode) {
        while (currentNode.right != null) {
            currentNode = currentNode.right;
        }
        return currentNode;
    }
    //InOrder traversal
    void inOrder(node currentNode) {

        if (currentNode == null) {
            return;
        }
        inOrder(currentNode.left);
        System.out.print(currentNode.data + " ");
        inOrder(currentNode.right);

    }

    //PreOrder traversal
    void preOrder(node currentNode) {
        if (currentNode == null) {
            return;
        }
        System.out.print(currentNode.data + " ");
        preOrder(currentNode.left);
        preOrder(currentNode.right);
    }

    void postOrder(node currentNode) {
        if (currentNode == null) {
            return;
        }
        postOrder(currentNode.left);
        postOrder(currentNode.right);
        System.out.print(currentNode.data + " ");
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(100);
        bst.insert(50);
        bst.insert(150);
        bst.insert(25);
        bst.insert(75);
        bst.insert(125);
        bst.insert(175);
        bst.insert(10);
        bst.insert(30);
        bst.insert(60);
        bst.insert(90);
        bst.insert(110);
        bst.insert(140);
        bst.insert(160);
        bst.insert(190);
        bst.delete(50);
        System.out.println(bst.root.left.left.right.data);
         //bst.inOrder(bst.root);



    }

}
