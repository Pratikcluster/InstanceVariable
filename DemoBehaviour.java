package com;

public class DemoBehaviour {
    int i = 10;
    int j = 20;
    int k = 30;
    void add() {
        int l = i+j;
        System.out.println(l);
    }

    public static void main(String[] args) {
        DemoBehaviour A = new DemoBehaviour();
        System.out.println(A.i);
        A.add();

    }
}
