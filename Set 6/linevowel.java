package com.company;

public class linevowel {
    public static void main(String[] args) {
        String str="Failures are stepping stones to Success";
        str=str.toUpperCase();
        int va=0,ve=0,vi=0,vo=0,vu=0;
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            if(ch=='A')
                va++;
            else if(ch=='E')
                ve++;
            else if(ch=='I')
                vi++;
            else if(ch=='O')
                vo++;
            else if(ch=='U')
                vu++;

        }
        System.out.println("A: "+va+"\nE:"+ve+"\nI: "+vi+"\nO: "+vo+"\nU: "+vu);
    }
}
