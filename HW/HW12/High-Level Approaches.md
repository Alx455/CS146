I had actually worked on this problem on leetcode previously and I remeber using a disjoint
set for this solution. The idea is to sort all the costs of both wells and pipes such that
we set ourselves up to create an MST with our disjoint set. After sorting, it is a matter of
building the MST by unioning all houses until they are all part of the same set(meaning the MST
has been completed). They key here is to format our wells costs in the same way that the pipes
array is formated in. In this case, we can use the 0 value to denote a house having a well.
So the format [0, 3, 2] for example means the cost of a well at house 3 is 2. Each time we are
unioning a previously unconnected city/or isntalling a well, we add the cost to our total.
