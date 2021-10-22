package com.company;

public class PriorityQueue {

        private int maxSize;
        private Student[] queArray;
        private int nItems;

        public PriorityQueue(int s)
        {
            maxSize = s;
            queArray = new Student[maxSize];
            nItems = 0;
        }

        public void insert(Student item)
        {
            int j;
            if(nItems==0)
                queArray[nItems++]=item;
            else
            {
                for(j=nItems-1; j>=0; j--)
                {
                    if( item.age > queArray[j].age )
                        queArray[j+1] = queArray[j];
                    else
                        break;
                }
                queArray[j+1] = item;
                nItems++;
            }
        }

        public Student remove()
        { return queArray[--nItems]; }

        public Student peekMin()
        { return queArray[nItems-1]; }

        public boolean isEmpty()
        { return (nItems==0); }

        public boolean isFull()
        { return (nItems == maxSize); }

    }


