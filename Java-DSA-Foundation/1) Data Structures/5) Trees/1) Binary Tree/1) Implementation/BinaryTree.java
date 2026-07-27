class BinaryTree
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args)
    {
        // Node root=new Node(10);

        // root.left=new Node(20);
        // root.left.left=new Node(40);
        // root.left.right=new Node(50);

        // root.right=new Node(30);
        // root.right.left=new Node(60);
        // root.right.right=new Node(70);

        Node root=new Node(10);

        Node b=new Node(20);
        root.left=b;

        Node c=new Node(30);
        root.right=c;

        Node d=new Node(40);
        // root.left.left=d;
        b.left=d;

        Node e=new Node(50);
        // root.left.right=e;
        b.right=e;

        Node f=new Node(60);
        // root.right.left=f;
        c.left=f;

        Node g=new Node(70);
        // root.right.right=g;
        c.right=g;

        Node h=new Node(80);
        d.left=h;

        Node i=new Node(90);
        g.right=i;

        // Node j=new Node(100);

        System.out.println(root.data);

        System.out.println(root.left.data);
        System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);

        System.out.println(root.right.data);
        System.out.println(root.right.left.data);
        System.out.println(root.right.right.data);

        System.out.println();

        BinaryTree BT=new BinaryTree();
        BT.display(root);

        
    }

    void display(Node root)
    {
        if(root==null)  return;

        System.out.print(root.data + " --> ");
        if(root.left!=null) 
        {
            System.out.print(root.left.data + " , " );
        }
        else
        {
            System.out.print("null , ");
        }

        if(root.right!=null) 
        {
            System.out.print(root.right.data);
        }
        else
        {
            System.out.print("null ");
        }

        System.out.println();

        display(root.left);
        display(root.right);
    }
}