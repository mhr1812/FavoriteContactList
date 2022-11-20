# Favorite Contact List DAA Assignment

### Name - Mihir Chowdhury
### Roll no- 48
### Section- A

## Question:
Give an application and its implementation to demonstrate the implementation of data structure for handling the "Favorite" contact list.

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

## Implementation of functionalities:

### 1) Add Contact
![Add Contact ScreenShot](https://user-images.githubusercontent.com/89465612/202915257-0532f19a-105f-48c7-ab68-11fc9a93e710.png)

### 2) Edit Contact
![Edit Contact ScreenShot](https://user-images.githubusercontent.com/89465612/202915804-880953d3-589d-464a-aff3-513a7b137974.png)

### 3) Next Contact
![Next Contact ScreenShot](https://user-images.githubusercontent.com/89465612/202915989-3d88bdd3-90da-44be-9c91-405445ddac2e.png)

### 4) List all Contacts (Favorites first)
![all Contacts Screenshot](https://user-images.githubusercontent.com/89465612/202916171-9fc89a21-46e8-4621-a948-1c9dd2f495ae.png)

### 5) View Contact
![View Contact Screenshot](https://user-images.githubusercontent.com/89465612/202916429-db7724ad-94a5-434a-9237-b33bc3ee4163.png)

### 6) Remove Contact
![Remove Contact Screenshot](https://user-images.githubusercontent.com/89465612/202916711-7fdecf9c-5ac1-492d-bf5f-1e740f0ba03d.png)



