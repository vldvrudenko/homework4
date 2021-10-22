package com.company;


    class Stack<T> {
        private int maxSize;
        private T[] stackArray;
        private int top;

        public Stack(int s)
        {
            maxSize = s;
            stackArray = (T[]) new Object[maxSize];;
            top = -1;
        }

        public void push(T j)
        {
            if (!isFull())

                stackArray[++top] = j;
            else
                System.out.println("Стек переповнений");
        }

        public T pop()
        {

            return stackArray[top--];
        }

        public T peek()
        {
            return stackArray[top];
        }

        public boolean isEmpty()
        {
            return (top == -1);
        }

        public boolean isFull()
        {
            return (top == maxSize-1);
        }

    }


