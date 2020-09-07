package 笔试.贝壳;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Scanner;

public class 剪刀石头布 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        cin.nextLine();
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=cin.nextLine();
            list.add(s);
        }
        ArrayList<String> list1=new ArrayList<>();
        for(int i=0;i<n;i++){
            //int len=list.get(i).length();
            String s=list.get(i);
            int left=0;

            if (s.charAt(4)=='J'){
                if (s.charAt(6)=='J'){
                    if (s.charAt(0)=='S'){
                        left=100;
                    }
                    else if (s.charAt(0)=='J'){
                        left=0;
                    }
                    else if (s.charAt(0)=='B'){
                        left=0;
                    }
                }
                else if (s.charAt(6)=='S'){
                    if (s.charAt(0)=='S'){
                        left=50;
                    }
                    else if (s.charAt(0)=='J'){
                        left=0;
                    }
                    else if (s.charAt(0)=='B'){
                        left=50;
                    }
                }
                else if (s.charAt(6)=='B'){

                    if (s.charAt(0)=='S'){
                        left=50;
                    }
                    else if (s.charAt(0)=='J'){
                        left=50;
                    }
                    else if (s.charAt(0)=='B'){
                        left=0;
                    }
                }
            }
            else if (s.charAt(4)=='S'){

                if (s.charAt(6)=='J'){

                    if (s.charAt(0)=='S'){
                        left=50;
                    }
                    else if (s.charAt(0)=='J'){
                        left=0;
                    }
                    else if (s.charAt(0)=='B'){
                        left=50;
                    }

                }
                else if (s.charAt(6)=='S'){

                    if (s.charAt(0)=='S'){
                        left=0;
                    }
                    else if (s.charAt(0)=='J'){
                        left=0;
                    }
                    else if (s.charAt(0)=='B'){
                        left=100;
                    }

                }
                else if (s.charAt(6)=='B'){
                    if (s.charAt(0)=='S'){
                        left=0;
                    }
                    else if (s.charAt(0)=='J'){
                        left=50;
                    }
                    else if (s.charAt(0)=='B'){
                        left=50;
                    }

                }
            }
            else if (s.charAt(4)=='B'){
                if (s.charAt(6)=='J'){

                    if (s.charAt(0)=='S'){
                        left=50;
                    }
                    else if (s.charAt(0)=='J'){
                        left=50;
                    }
                    else if (s.charAt(0)=='B'){
                        left=0;
                    }

                }
                else if (s.charAt(6)=='S'){

                    if (s.charAt(0)=='S'){
                        left=0;
                    }
                    else if (s.charAt(0)=='J'){
                        left=0;
                    }
                    else if (s.charAt(0)=='B'){
                        left=50;
                    }

                }
                else if (s.charAt(6)=='B'){

                    if (s.charAt(0)=='S'){
                        left=0;
                    }
                    else if (s.charAt(0)=='J'){
                        left=100;
                    }
                    else if (s.charAt(0)=='B'){
                        left=0;
                    }

                }

            }
            //System.out.print(left);
            int right=0;

            if (s.charAt(4)=='J'){
                if (s.charAt(6)=='J'){
                    if (s.charAt(2)=='S'){
                        right=100;
                    }
                    else if (s.charAt(2)=='J'){
                        right=0;
                    }
                    else if (s.charAt(2)=='B'){
                        right=0;
                    }
                }
                else if (s.charAt(6)=='S'){
                    if (s.charAt(2)=='S'){
                        right=50;
                    }
                    else if (s.charAt(2)=='J'){
                        right=0;
                    }
                    else if (s.charAt(2)=='B'){
                        right=50;
                    }
                }
                else if (s.charAt(6)=='B'){

                    if (s.charAt(2)=='S'){
                        right=50;
                    }
                    else if (s.charAt(2)=='J'){
                        right=50;
                    }
                    else if (s.charAt(2)=='B'){
                        right=0;
                    }
                }
            }
            else if (s.charAt(4)=='S'){

                if (s.charAt(6)=='J'){

                    if (s.charAt(2)=='S'){
                        right=50;
                    }
                    else if (s.charAt(2)=='J'){
                        right=0;
                    }
                    else if (s.charAt(2)=='B'){
                        right=50;
                    }

                }
                else if (s.charAt(6)=='S'){

                    if (s.charAt(2)=='S'){
                        right=0;
                    }
                    else if (s.charAt(2)=='J'){
                        right=0;
                    }
                    else if (s.charAt(2)=='B'){
                        right=100;
                    }

                }
                else if (s.charAt(6)=='B'){
                    if (s.charAt(2)=='S'){
                        right=0;
                    }
                    else if (s.charAt(2)=='J'){
                        right=50;
                    }
                    else if (s.charAt(2)=='B'){
                        right=50;
                    }

                }
            }
            else if (s.charAt(4)=='B'){
                if (s.charAt(6)=='J'){

                    if (s.charAt(2)=='S'){
                        right=50;
                    }
                    else if (s.charAt(2)=='J'){
                        right=50;
                    }
                    else if (s.charAt(2)=='B'){
                        right=0;
                    }

                }
                else if (s.charAt(6)=='S'){

                    if (s.charAt(2)=='S'){
                        right=0;
                    }
                    else if (s.charAt(2)=='J'){
                        right=0;
                    }
                    else if (s.charAt(2)=='B'){
                        right=50;
                    }

                }
                else if (s.charAt(6)=='B'){

                    if (s.charAt(2)=='S'){
                        right=0;
                    }
                    else if (s.charAt(2)=='J'){
                        right=100;
                    }
                    else if (s.charAt(2)=='B'){
                        right=0;
                    }

                }
            }
            if (left>right){
                list1.add("left");

            }
            else if(left<right){
                list1.add("right");

            }
            else{
                list1.add("same");

            }

        }
        for (String m:list1){
            System.out.println(m);
        }
    }
}
