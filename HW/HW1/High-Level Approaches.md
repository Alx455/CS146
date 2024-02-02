Initially I thought I would use a Stack. I would iterate through
the string with a for loop and insert each character into the stack.
Then I would iterate through the string a second time, and for each
iteration i'd pop a character off the stack and compare it to the
current iterated character.
Then I realized I could just do the comparison in a single for loop  by
just comparing each ends of the string at the same time.
