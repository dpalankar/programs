    package datastructure.programs;

public class RopeDataStructure {

    // Rope Node class
    static class RopeNode {
        int weight;
        RopeNode left, right;
        String data;

        // Constructor for leaf nodes
        RopeNode(String data) {
            this.data = data;
            this.weight = data.length();
        }

        // Constructor for internal nodes
        RopeNode(RopeNode left, RopeNode right) {
            this.left = left;
            this.right = right;
            this.weight = (left != null) ? left.length() : 0;
        }

        // Calculate the total length of the rope
        int length() {
            if (data != null) {
                return data.length();
            }
            int leftLength = (left != null) ? left.length() : 0;
            int rightLength = (right != null) ? right.length() : 0;
            return leftLength + rightLength;
        }

        // Retrieve character at a specific index
        char charAt(int index) {
            if (data != null) {
                return data.charAt(index);
            }
            if (index < weight) {
                return left.charAt(index);
            } else {
                return right.charAt(index - weight);
            }
        }

        // Convert the rope to a string representation
        String toStringRepresentation() {
            if (data != null) {
                return data;
            }
            StringBuilder sb = new StringBuilder();
            if (left != null) sb.append(left.toStringRepresentation());
            if (right != null) sb.append(right.toStringRepresentation());
            return sb.toString();
        }
    }

    // Pair class to hold the result of split operation
    static class Pair {
        RopeNode first, second;

        Pair(RopeNode first, RopeNode second) {
            this.first = first;
            this.second = second;
        }
    }

    // Split the rope at a given index
    static Pair split(RopeNode node, int index) {
        if (node == null) {
            return new Pair(null, null);
        }
        if (node.data != null) {
            String leftStr = node.data.substring(0, index);
            String rightStr = node.data.substring(index);
            return new Pair(new RopeNode(leftStr), new RopeNode(rightStr));
        }
        if (index < node.weight) {
            Pair splitPair = split(node.left, index);
            RopeNode right = new RopeNode(splitPair.second, node.right);
            return new Pair(splitPair.first, right);
        } else {
            Pair splitPair = split(node.right, index - node.weight);
            RopeNode left = new RopeNode(node.left, splitPair.first);
            return new Pair(left, splitPair.second);
        }
    }

    // Concatenate two ropes
    static RopeNode concatenate(RopeNode left, RopeNode right) {
        return new RopeNode(left, right);
    }

    // Insert a string into the rope at a specified index
    static RopeNode insert(RopeNode root, int index, String str) {
        Pair splitPair = split(root, index);
        RopeNode middle = new RopeNode(str);
        return concatenate(concatenate(splitPair.first, middle), splitPair.second);
    }

    // Delete a substring from the rope starting at a specific index and length
    static RopeNode delete(RopeNode root, int start, int length) {
        Pair firstSplit = split(root, start);
        Pair secondSplit = split(firstSplit.second, length);
        return concatenate(firstSplit.first, secondSplit.second);
    }

    // Main method to demonstrate the Rope operations
    public static void main(String[] args) {
        // Create initial rope with "Hello " and "World!"
        RopeNode left = new RopeNode("Hello ");
        RopeNode right = new RopeNode("World!");
        RopeNode root = concatenate(left, right);

        System.out.println("Resulting String: " + root.toStringRepresentation());

        // Insert "Beautiful " at index 6
        root = insert(root, 6, "Beautiful ");

        System.out.println("Resulting String: " + root.toStringRepresentation());

        // Delete "World!" starting from index 16 (after "Hello Beautiful ")
        root = delete(root, 16, 6);

        // Output the resulting string
        System.out.println("Resulting String: " + root.toStringRepresentation());
    }
}
