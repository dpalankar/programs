package datastructure.programs;

class RopeNode {
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

    int length() {
        if (data != null) {
            return data.length();
        }
        int leftLength = (left != null) ? left.length() : 0;
        int rightLength = (right != null) ? right.length() : 0;
        return leftLength + rightLength;
    }

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

    String toStringRepresentation() {
        if (data != null) {
            return data;
        }
        StringBuilder sb = new StringBuilder();
        if (left != null) sb.append(left.toStringRepresentation());
        if (right != null) sb.append(right.toStringRepresentation());
        return sb.toString();
    }
    static class Pair {
        RopeNode first, second;

        Pair(RopeNode first, RopeNode second) {
            this.first = first;
            this.second = second;
        }
    }

    static Pair split(RopeNode node, int index) {
        if(node.data !=null){
            String first = node.data.substring(0,index);
            String second = node.data.substring(index, node.weight);
            new Pair(new RopeNode(first),new RopeNode(second));
        }
        if(index < node.weight){

        }
        return null;
    }

}
