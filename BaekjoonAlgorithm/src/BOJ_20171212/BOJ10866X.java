package BOJ_20171212;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ10866X {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        final int count = scanner.nextInt();
        Deque deque = new Deque();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++){
            String func = scanner.next();

            switch (func) {
                case "push_front":
                    int frontInput = scanner.nextInt();
                    deque.pushFront(frontInput);
                    break;
                case "push_back":
                    int backInput = scanner.nextInt();
                    deque.pushFront(backInput);
                    break;
                case "pop_front":
                    builder.append(deque.popFront() + ","); break;
                case "pop_back":
                    builder.append(deque.popBack() + ","); break;
                case "size":
                    builder.append(deque.size() + ","); break;
                case "empty":
                    builder.append(deque.empty() + ","); break;
                case "front":
                    builder.append(deque.front() + ","); break;
                case "back":
                    builder.append(deque.back() + ",");break;
                default: break;
            }

        }
        String[] sAry = builder.toString().split(",");
        
        for(int i = 0; i < sAry.length - 1; i++){
            System.out.println(sAry[i]);
        }
        System.out.print(sAry[sAry.length - 1]);
    }

    static class Deque{
        private List<Integer> list;

        public Deque() {
            this.list = new ArrayList<>();
        }

        public void pushFront(Integer value){
            List<Integer> newList = new ArrayList<>();
            newList.add(value);

            for(int i = 0; i < list.size(); i++){
                newList.add(list.get(i));
            }
            this.list = newList;
        }

        public void pushBack(Integer value){
            list.add(value);
        }

        public int popFront(){
            if(list.size() == 0){
                return -1;
            }
            Integer value = list.get(0);
            list.remove(0);
            return (int)value;
        }

        public int popBack(){
            if(list.size() == 0){
                return -1;
            }
            int lastIndex = list.size() - 1;

            Integer value = list.get(lastIndex);
            list.remove(lastIndex);
            return value;
        }

        public int size(){
            return list.size();
        }

        public int empty(){
            return list.isEmpty() ? 1 : 0;
        }

        public int front(){
            if(list.size() == 0){
                return -1;
            }
            return list.get(0);
        }

        public int back(){
            if(list.size() == 0){
                return -1;
            }
            return list.get(this.size() - 1);
        }
    }
}
