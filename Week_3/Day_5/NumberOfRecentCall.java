class RecentCounter {
    Queue<Integer> q;

    public RecentCounter() {
        q=new LinkedList<>();
    }
    
    public int ping(int t) {
        //add current request
        q.offer(t);
        
        //remove old requests
        while(q.peek()<t-3000){
            q.poll();
        }
        //current valid requests count
        return q.size();
    }
}
