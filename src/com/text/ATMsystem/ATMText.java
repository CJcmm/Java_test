package com.text.ATMsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMText {
    public static void main(String[] args) {
        ArrayList<ATMAccount> accounts = new ArrayList<>();
        //
        showMain(accounts);

    }

    //首页
    public static void showMain(ArrayList<ATMAccount> accounts) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==========欢迎进入tyy银行ATM系统==========");
            System.out.println("1.登录账户");
            System.out.println("2.注册账户");
            System.out.print("请输入命令1、2选择对应操作:");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    //登录
                    Login(accounts, sc);
                    break;
                case 2:
                    //注册
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您当前输入的操作命令不被支持！");
            }
        }
    }

    //注册界面
    public static void register(ArrayList<ATMAccount> accounts, Scanner sc) {
        System.out.println("==========欢迎进入tyy银行用户注册界面==========");
        System.out.println("请输入您的开户名称：");
        ATMAccount account=new ATMAccount();
        account.setUserName(sc.next());
        String okPassword = "";
        while (true) {
            System.out.println("请输入您的开户密码：");
            account.setPassWord(sc.next());
            System.out.println("请您再次确认密码：");
            okPassword = sc.next();
            if (okPassword.equals(account.getPassWord())) {
                break;
            } else {
                System.out.println("两次密码必须一致！");
            }
        }
        System.out.println("请您输入当次限额：");
        account.setQuotaMoney(sc.nextDouble());
        account.setCardId(creatCardId(accounts));

        accounts.add(account);
        System.out.println("恭喜" + account.getUserName() + "开户成功！您的卡号是：" + account.getCardId());
    }

    //随机生成8位数字创建卡号
    public static String creatCardId(ArrayList<ATMAccount> accounts) {
        while (true) {

            Random r = new Random();
            String cardId = "";
            for (int i = 0; i <= 8; i++) {
                cardId += r.nextInt(0, 10);
            }
            ATMAccount ac = getAccountByCardId(accounts, cardId);
            if (ac == null) {
                return cardId;
            }
        }
    }

    //根据卡号查询对象
    public static ATMAccount getAccountByCardId(ArrayList<ATMAccount> accounts, String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            ATMAccount ac = accounts.get(i); //拿出集合中的一个元素
            if (ac.getCardId().equals(cardId)) {//卡住的地方，因为不熟JavaBean处getxxx的知识点
                return ac;
            }
        }
        return null;
    }

    //登录
    public static void Login(ArrayList<ATMAccount> accounts, Scanner sc) {
        if (accounts.size() == 0) {
            System.out.println("系统当前无用户存在，请先注册");
            return;
        }
        ATMAccount ac = new ATMAccount();
        while (true) {
            System.out.println("请输入卡号：");
            String cardId = sc.next();
            ac = getAccountByCardId(accounts, cardId);
            if (ac != null) {
                while (true) {
                    System.out.println("请输入登录密码：");
                    String password = sc.next();
                    if (ac.getPassWord().equals(password)) {
                        System.out.println("恭喜您，" + ac.getUserName() + "先生/女士，欢迎您进入tyy银行系统！");
                        //展示系统登录之后的操作
                        showUserCommand(accounts,ac, sc);
                    } else {
                        System.out.println("密码错误，请重新输入");
                    }
                }
            } else {
                System.out.println("账户不存在，请重新输入");
                break;
            }
        }
    }

    //展示用户操作页面
    private static void showUserCommand(ArrayList<ATMAccount> accounts,ATMAccount ac, Scanner sc) {
        while (true) {
            System.out.println("==========欢迎进入tyy银行用户操作界面==========");
            System.out.println("1.查询" + "\n" + "2.存款" + "\n" + "3.取款" + "\n" + "4.转账" + "\n" +
                    "5.修改密码" + "\n" + "6.退出" + "\n" + "7.注销当前用户");
            System.out.println("请输入对应操作：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询
                    showAccount(ac);
                    break;
                case 2:
                    //存款
                    depositMoney(ac, sc);
                    break;
                case 3:
                    //取款
                    drawMoney(ac, sc);
                    break;
                case 4:
                    //转账
                    transferMoney(accounts, ac, sc);
                    break;
                case 5:
                    //修改密码
                    updatePassword(ac,sc);
                    return;
                case 6:
                    //退出
                    System.out.println("回到首页");
                    return;
                case 7:
                    //注销当前用户
                    accounts.remove(ac);
                    System.out.println("销户成功1");
                    return;
                default:
                    System.out.println("您当前输入的操作命令不被支持！");

            }
        }
    }

    //修改密码
    private static void updatePassword(ATMAccount ac,Scanner sc) {
        System.out.println("===========修改密码===========");
        while (true) {
            System.out.println("请输入原密码：");
            String okPassWord=sc.next();
            if (ac.getPassWord().equals(okPassWord)){
                while (true) {
                    System.out.println("请输入新密码：");
                    String newPassword=sc.next();
                    System.out.println("请确认新密码：");
                    String okNewPassword=sc.next();
                    if (newPassword.equals(okNewPassword)){
                        ac.setPassWord(okPassWord);
                    }else {
                        System.out.println("两次输入密码不一致");
                        return;
                    }
                }
            }else {
                System.out.println("密码错误");
            }
        }
    }

    //转账
    private static void transferMoney(ArrayList<ATMAccount> accounts,ATMAccount ac,Scanner sc) {
        if (accounts.size()<2){
            System.out.println("对不起，系统中无其他用户");
            return;
        }else if (ac.getMoney()==0){
            System.out.println("您没钱");
        }

        while (true) {
            System.out.println("请输入对方账户卡号：");
            String carId= sc.next();
            ATMAccount account=getAccountByCardId(accounts,carId);
            if (account != null) {
                if (account.equals(ac)) {
                    System.out.println("您不能给自己转账！");
                }else {
                    String name="*"+account.getUserName().substring(1);
                    System.out.println("请您确认"+name+"的姓氏");
                    String preName=sc.next();
                    if (account.getUserName().startsWith(preName)) {
                        System.out.println("请输入转账金额：");
                        double money= sc.nextDouble();
                        if (money>ac.getMoney()){
                            System.out.println("余额不足");
                        }else {
                            ac.setMoney(ac.getMoney()-money);
                            account.setMoney(account.getMoney()+money);
                            System.out.println("转账成功");
                            showAccount(ac);
                            return;
                        }
                    }else {
                        System.out.println("姓氏认证失败");
                    }
                }
            }else {
                System.out.println("您输入的卡号有误");
            }
        }
    }

    //取款
    private static void drawMoney(ATMAccount ac,Scanner sc) {

        if (ac.getMoney()>=0){
            while (true) {
                System.out.println("请输入取款金额:");
                double money= sc.nextDouble();
                if (money<=ac.getMoney()){
                    if (money<= ac.getQuotaMoney()){
                        ac.setMoney(ac.getMoney()-money);
                        System.out.println("取钱成功！当前账户还剩余"+ac.getMoney());
                        return;
                    }else {
                        System.out.println("超出限额，限额为"+ac.getQuotaMoney()+"，请重新输入金额");
                    }
                }else {
                    System.out.println("您的余额不足");
                }
            }
        }else {
            System.out.println("您没有钱了");
        }
    }

    //存款
    private static void depositMoney(ATMAccount ac, Scanner sc) {
        System.out.println("请输入存款金额：");
        double money = sc.nextDouble();
        ac.setMoney(ac.getMoney() + money);
        System.out.println("存款成功！");
    }

    //展示用户信息
    private static void showAccount(ATMAccount ac) {
        System.out.println("================当前用户详情================");
        System.out.println("卡号：" + ac.getCardId());
        System.out.println("姓名：" + ac.getUserName());
        System.out.println("余额：" + ac.getMoney());
        System.out.println("当次限额：" + ac.getQuotaMoney());
    }
}
