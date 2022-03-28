#include <iostream>
using namespace std;

struct Node{
    int data;
    Node* next;
};

void ReversePrint (Node* ptr){
    // Base case : if the list is empty, do nothing
    if (ptr!= nullptr){ // general case
    //process the rest
        ReversePrint(ptr->next);
        cout << ptr->data << endl;
        // print this element
    }
    else{
        return;
    }
}

int main(){

  Node* Node1 = new Node;
  Node* Node2 = new Node;
  Node* Node3 = new Node;

  Node1 ->data = 1;
  Node2 ->data = 2;
  Node3 ->data = 3;

  Node1 ->next = Node2;
  Node2 ->next = Node3;
  Node3 ->next = NULL;

  ReversePrint(Node1);

}
