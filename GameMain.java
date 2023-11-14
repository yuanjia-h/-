import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        //调用类
        Player player = new Player();
        Computer computer = new Computer();
        Judge judge = new Judge();
        GameMode gameMode = new GameMode();


        //游戏界面
        System.out.println("-----------------------------------");
        System.out.println("           剪刀石头布         ");
        System.out.println("                    作者：萧萧");
        System.out.println("                    版本：1.0");
        System.out.println("-----------------------------------");
        System.out.println("------------------游戏开始------------------");

        //玩家输入名称
        player.play_name();
        //玩家选择电脑角色
        computer.computer_role();
        //游戏模式选择
        player.game_mode();
        //根据玩家选择的游戏模式，来输出多少次对决，while控制
        gameMode.play_game(player,computer,judge);
//        //输出最后结果
//        judge.last_winner();
        //玩家选择是否继续进行游戏
        gameMode.continue_game();
//        while (judge.continue_option < 3){
//            switch (judge.continue_option){
//                case 1:
//                    player.game_mode();
//                    GameMode.play_game(player,computer,judge);
//                    judge.last_winner();
//                    break;
//                case 2:
//                    computer.computer_role();
//                    player.game_mode();
//                    GameMode.play_game(player,computer,judge);
//                    judge.last_winner();
//                default:
//                    System.out.println("正在退出.....");
//            }

        }


    }

//    public static void play_game(Player player, Computer computer, Judge judge){
//        int i = 1;
//        System.out.println("------------------开始对决------------------");
//        while (i <= player.getOption()){
//            System.out.println("                   第" + i + "轮                   ");
//            //玩家出拳选择
//            player.player_choice();
//            //电脑出拳，随机生成
//            computer.com_choice();
//            //判断结果
//            System.out.println("                  第" + i + "轮结果                   ");
//            judge.winner(player,computer);
//            i += 1;
//        }
//    }

//}
