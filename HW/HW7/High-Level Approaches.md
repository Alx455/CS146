My first thought when reading the problem was to apply a queue. initially, I
had trouble figuring out how to organize the queue such that I could compare
the time intervals with each other. I knew I had to compare the beginning interval
with the end interval of the last server runtime, I just did not know how to deal
with the case that one of the later runtimes had a smaller end interval. I got the idea
of using a priority queue when I actually looked at the extra credit! I saw the question
about heaps as priority queues and looked into priority queues and it turned out to
be exactly what I needed. It allowed me to organize my queue to be able to compare
start intervals with the smallest end interval that currently occupied a server.
I iterated through the time intervals and added/popped the priority queue
accordingly. At the end, I return the size of the queue as it will contain all the 
seperate end intervals that were occupying a server at the same time.

Addendum:
Because I have minimal python experience prior to this course, I typically code my
initial solutions in java, and then translate that code into python. I found out that
python has no built in priority queues, and so I found myself at a halt when trying to 
translate my java code which used a priority queue. By a little research, I found out
python has an import called heapq. It is essentially a priority queue but has the
operations denoted as the operations of a heap. It really helped solidify my understanding
of how a heaps can be used as priority queues!
