package academy.learnprogramming;

public class BinarySearchTree {
    Node root;
    int numOfLeaves;

    public BinarySearchTree(){
        this.root = null;
        this.numOfLeaves = 0;
    }

    public BinarySearchTree(int value){
        this.root.value = value;
        this.root.left = null;
        this.root.right = null;
    }

    public void insert(int value){
        Node newNode = new Node(value);
        if(this.root == null){
            this.root = newNode;
            this.numOfLeaves++;
        }else{
            Node currentNode = this.root;
            while(true){
                if(value < currentNode.value){
                    //left
                    if(currentNode.left == null){
                        currentNode.left = newNode;
                        this.numOfLeaves++;
                        return;
                    }
                    currentNode = currentNode.left;
                }else{
                    //right
                    if(currentNode.right == null){
                        currentNode.right = newNode;
                        this.numOfLeaves++;
                        return;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }

    public void lookup(int value) {

        if (this.root == null) {
            System.out.println("Value is not in tree, because tree is empty");
        }else{
            Node currentNode = this.root;
            while(true){
                if(value < currentNode.value){
                    //left
                    if(currentNode.left == null){
                        System.out.println(value+" is not in the tree.");
                        return;
                    }
                    currentNode = currentNode.left;
                }else if(value > currentNode.value){
                    //right
                    if(currentNode.right == null){
                        System.out.println(value+" is not in the tree.");
                        return;
                    }
                    currentNode = currentNode.right;
                }else{
                    System.out.println(value+" IS in the tree.");
                    return;
                }
            }
        }
    }

    public void remove(int value){
        if (this.root == null) {
            System.out.println("Tree is empty");
        }else{
            Node parentNode = null;
            Node currentNode = this.root;
            while(currentNode != null){
                if(value < currentNode.value){
                    //left
                    parentNode = currentNode;
                    currentNode = currentNode.left;
                }else if(value > currentNode.value){
                    //right
                    parentNode = currentNode;
                    currentNode = currentNode.right;
                }else if(currentNode.value == value){
                    //match
                    //option 1: no right  child:
                    if (currentNode.right == null) {
                        if(parentNode == null){
                            this.root = currentNode.left;
                        }else{
                            //. if parent > current value, make current left child a child of parent
                            if(currentNode.value < parentNode.value){
                                parentNode.left = currentNode.left;
                            //if parent < current value, make left child a right child of parent
                            }else if(currentNode.value > parentNode.value){
                                parentNode.right = currentNode.left;
                            }
                        }

                    //option 2: right child which doesnt have a left child
                    }else if(currentNode.right.left == null){
                        if(parentNode == null){
                            this.root = currentNode.left;
                        }else{
                            currentNode.right.left = currentNode.left;
                        }
                        // if parent > current, make right child of the left the parent
                        if(currentNode.value < parentNode.value){
                            parentNode.left = currentNode.right;
                            //if parent < current, make right child a right child of the parent
                        }else if(currentNode.value > parentNode.value){
                            parentNode.right = currentNode.right;
                        }
                    //Option 3: right child that has a left child
                    }else{
                        // find the right child's left most child
                        Node leftMost = new Node();
                        Node leftMostParent = new Node();
                        leftMost = currentNode.right.left;
                        leftMostParent = currentNode.right;
                        while(leftMost.left != null){
                            leftMostParent = leftMost;
                            leftMost = leftMost.left;
                        }
                        //Parent's left subtree is now leftmost's right subtree
                        leftMostParent.left = leftMost.right;
                        leftMost.left = currentNode.left;
                        leftMost.right = currentNode.right;

                        if(parentNode == null){
                            this.root = leftMost;
                        }else{
                            if(currentNode.value < parentNode.value){
                                parentNode.left = leftMost;
                            }else if(currentNode.value > parentNode.value){
                                parentNode.right = leftMost;
                            }
                        }
                    }

                }
            }
        }
    }

    public int getNumOfLeaves(){
        return this.numOfLeaves;
    }


    public Node traverse(Node node){
        Node newNode = new Node(node.value);
        if(node.left == null){
            newNode.left = null;
        }else{
            newNode.left = traverse(node.left);
        }

        if(node.right == null){
            newNode.right = null;
        }else{
            newNode.right = traverse(node.right);
        }
        return newNode;
    }

    private class Node{
        int value;
        Node left;
        Node right;

        Node(){}

        Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public void describeNode(){
            if (this.left == null && this.right ==null) {
                System.out.println("Node {\n\tleft: Null\n\tValue: " + this.value + "\n\tright: Null\n}");
            } else if (this.right == null) {
                System.out.println("Node # {\n\tleft: "+ this.left.value +"\n\tValue: " + this.value + "\n\tright: Null\n}");
            } else{
                System.out.println("Node {\n\tleft: Null\n\tValue: " + this.value + "\n\tright: "+this.right.value+"\n}");
            }
        }
    }
}
