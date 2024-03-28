I knew that the only way that courses would not be able to be completed woould be if one was a
prerequisite of another course that was a prerequisite for that one or one of its prerequisites.
In simple terms, I had to check if there was a cycle.
From doing the extra credit assignment on topological sort, I knew that a way to confirm whether
a graph has cycles is to check it its topological sort returns a complete array(no missing nodes).
So I copy pasted my code for toopological sort and had it check if the topological sorting was
complete. If its incomplete, I returned false, if it was complete, I returned true.
