# problem Number of Recent Calls
# link to problem : https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3480/

from collections import deque

class RecentCounter:

    def __init__(self):
        self.deq = deque()

    def ping(self, t: int) -> int:
        self.deq.append(t)
        
        while(self.deq[0] < t -3000):
            self.deq.popleft()
                
        return len(self.deq)


# Your RecentCounter object will be instantiated and called as such:
# obj = RecentCounter()
# param_1 = obj.ping(t)