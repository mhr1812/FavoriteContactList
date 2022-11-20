# Favorite Contact List DAA Assignment

### Name - Mihir Chowdhury
### Roll no- 48
### Section- A

## Question:
Given an application and its implementation to demonstrate the implementation of data structure for handling the "Favorite" contact list in mobiles.

## Approach:
1. Created a menu driven contact list application in Java with the following functionalities:-
    1. Add Contact
    2. Edit Contact 
    3. Next Contact
    4. List all Contacts (Favorites first)
    5. View Contact
    6. Remove Contact

2. The contacts are listed based on the priority (favorite contacts are listed before general (non-favorite) contacts).
 
3. This is implemented by using the Priority Queue Data Structure. Hence priority queue is used to maintain the contact list.

4. PriorityQueue is internally implemented by following “Priority Heap” data structure.

5. The priorities assigned are: FAVORITE (high priority) and GENERAL (low priority)

## Complexity:

1. O(log n) time for the enqueing and dequeing methods (offer, poll, remove() and add)

2. O(n) for the remove(Object) and contains(Object) methods

3. O(1) for the retrieval methods (peek, element, and size)

## Implementation:
