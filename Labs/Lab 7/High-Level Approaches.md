My immediate idea was to use floyd warshal and look through the resulting shortest paths array.
I iterated through each node(city) and counted the amount of cities reachable within the
threshhold. I kept track of the node(city) with the lowest amount of cities reachable and
returned the last node that had the smallest amount of cities reachable.
