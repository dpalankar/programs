package datastructure.programs;

public class RopeNodeMain {
    public static void main(String[] args) {
        RopeNode left = new RopeNode("Hello ");
        RopeNode right = new RopeNode("World!");
        RopeNode root = new RopeNode(left, right);

        System.out.println("Full String: " + root.toStringRepresentation());
        System.out.println("Character at index 4: " + root.charAt(4));
    }
}
