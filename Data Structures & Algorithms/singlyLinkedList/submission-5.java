class LinkedList {

    node head;

    class node{
        int value;
        node next;

        node(int i){
            this.value =i;
            this.next = null;
        }
    }

    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        node currNode = head;
        for(int i=0;i<index;i++){
            if(currNode==null)
                return -1;
            currNode=currNode.next;
        }
        if (currNode == null)
            return -1;
        return currNode.value;
    }

    public void insertHead(int val) {
        node newNode = new node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertTail(int val) {
        node newNode = new node(val);
        if(head == null)
            head = newNode;
        else{
            node currNode = head;
            while(currNode.next != null)
                currNode = currNode.next;
            currNode.next = newNode;
        }
    }

    public boolean remove(int index) {
        node currNode = head;
        if(index == 0){
            if(head == null)
                return false;
            
            head = head.next;
            return true;
        }
        for(int i=0;i<index-1;i++){
            if(currNode==null)
                return false;
            currNode = currNode.next;
        }
        if(currNode == null || currNode.next==null)
            return false;
        currNode.next = currNode.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        node currNode = head;
        ArrayList<Integer> res = new ArrayList<>();
        while(currNode!=null){
            res.add(currNode.value);
            currNode = currNode.next;
        }
        return res;
    }
}
