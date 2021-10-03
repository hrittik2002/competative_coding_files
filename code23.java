import java.util.Scanner;

class code23{

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int t = Sc.nextInt();
        while(t-- > 0){
            int A = Sc.nextInt();
            int B = Sc.nextInt();
            int C = Sc.nextInt();
            int X = Sc.nextInt();
            int Y = Sc.nextInt();
            int Z = Sc.nextInt();
            int tl = 240;
            
            // Case 1 
            if(A + B + C <=12){
                int ans = 20*X + 20*Y + 20*Z;
                System.out.println(ans); 
            }
            else{
                    double profit_A = X / A;
                    double profit_B = Y / B;
                    double profit_C = Z / C;
                    int ans = 0;

                    if(profit_A >= profit_B && profit_A >= profit_C){
                        if(tl/A > 20){
                            ans = 20 * X;
                            tl = tl - (20 * A);
                            if(profit_B > profit_C){
                                if(tl/B > 20){
                                    ans += 20 * Y;
                                    tl = tl - (20 * B);

                                    if(tl/C > 20){
                                        ans += 20 * Z;
                                        tl = tl - (20 * C);
                                    }
                                    else if(tl/C <= 20){
                                        ans += (tl / C) * Z;
                                        tl = 0;
                                    }
                                }
                                else if(tl/B <= 20){
                                    ans += (tl / B) * Y;
                                    tl = 0;
                                }
                            }
                            else{
                                if(tl/C > 20){
                                    ans += 20 * Z;
                                    tl = tl - (20 * C);
                                    if(tl/B > 20){
                                        ans += 20 * Y;
                                        tl = tl - (20 * B);
                                    }
                                    else if(tl/B <= 20){
                                        ans += (tl / B) * Y;
                                        tl = 0;
                                    }
                                }
                                else if(tl/C <= 20){
                                    ans += (tl / C) * Z;
                                    tl = 0;
                                }
                            }
                        }
                        else if(tl/A <= 20){
                            ans = (tl / A) * X;
                            tl = 0;
                        }
                        System.out.println(ans);
                    }
                    else if(profit_B >= profit_A && profit_B >= profit_C){
                        if(tl/B > 20){
                            ans = 20 * Y;
                            tl = tl - (20 * B);

                            if(profit_A > profit_C){
                                if(tl/A > 20){
                                    ans += 20 * X;
                                    tl = tl - (20 * A);

                                    if(tl/C > 20){
                                        ans += 20 * Z;
                                        tl = tl - (20 * C);
                                    }
                                    else if(tl/C <= 20){
                                        ans += (tl / C) * Z;
                                        tl = 0;
                                    }
                                }
                                else if(tl/A <= 20){
                                    ans += (tl / A) * X;
                                    tl = 0;
                                }
                            }
                            else{
                                if(tl/C > 20){
                                    ans += 20 * Z;
                                    tl = tl - (20 * C);
                                    if(tl/A > 20){
                                        ans += 20 * X;
                                        tl = tl - (20 * A);
                                    }
                                    else if(tl/A <= 20){
                                        ans += (tl / A) * X;
                                        tl = 0;
                                    }
                                }
                                else if(tl/C <= 20){
                                    ans += (tl / C) * Z;
                                    tl = 0;
                                }
                            }
                        }
                        else if(tl/B <= 20){
                            ans = (tl / B) * Y;
                            tl = 0;
                        }
                        System.out.println(ans);
                    }
                    else if(profit_C >= profit_A && profit_C >= profit_B){
                        if(tl/C > 20){
                            ans = 20 * Z;
                            tl = tl - (20 * C);

                            if(profit_A > profit_B){
                                if(tl/A > 20){
                                    ans += 20 * X;
                                    tl = tl - (20 * A);

                                    if(tl/B > 20){
                                        ans += 20 * Y;
                                        tl = tl - (20 * B);
                                    }
                                    else if(tl/B <= 20){
                                        ans += (tl / B) * Y;
                                        tl = 0;
                                    }
                                }
                                else if(tl/A <= 20){
                                    ans += (tl / A) * X;
                                    tl = 0;
                                }
                            }
                            else{
                                if(tl/B > 20){
                                    ans += 20 * Y;
                                    tl = tl - (20 * B);
                                    if(tl/A > 20){
                                        ans += 20 * X;
                                        tl = tl - (20 * A);
                                    }
                                    else if(tl/A <= 20){
                                        ans += (tl / A) * X;
                                        tl = 0;
                                    }
                                }
                                else if(tl/B <= 20){
                                    ans += (tl / B) * Y;
                                    tl = 0;
                                }
                            }
                        }
                        else if(tl/C <= 20){
                            ans = (tl / C) * Z;
                            tl = 0;
                        }
                        System.out.println(ans);
                    }
            
            }
        }
    }
}
/**
 * int ans = 20*X;
                        if(12 - A >= B && 12 - A >= C){
                            if(profit_B > profit_C){
                                ans = ans + 20 * Y;
                            }
                            else{
                                ans = ans + 20 * Z;
                            }
                        }
                        else if(12 - A >= B){
                            ans = ans + 20 * Y;
                        }
                        else if(12 - A >= C){
                            ans = ans + 20 * Z;
                        }
                        System.out.println(ans);
 */