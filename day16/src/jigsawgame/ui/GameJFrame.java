package jigsawgame.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.Year;
import java.util.Random;


public class GameJFrame extends JFrame implements KeyListener, ActionListener {



    //
    int[][] arr1 = new int[4][4];

    //设置路径变量
    String path = "image\\animal\\animal3\\";

    //设置胜利数组
    int[][] win = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    //计步
    int step = 0;

    //创建选项下面的条目信息
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");




    public GameJFrame() {
        //初始化界面
        initJFrame();


        //打乱图片位置
        initdata();

        //初始化菜单
        initJMenuBar();

        //初始化图片
        initImage();
        //让页面显示,建议放在最后
        this.setVisible(true);
    }

    //创建随机二维数组打乱顺序
    int x = 0;
    int y = 0;
    private void initdata() {

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }


        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0 ;j < 4; j++) {
                if (arr[index] == 0) {
                    arr1[i][j] = arr[index];
                    x = i;
                    y = j;
                }else{
                arr1[i][j] = arr[index];
                }
                index++;
            }
        }
        System.out.println(x + " " + y);

    }

    //初始化图片
    private void initImage() {

        //清空已经出现的图片
        this.getContentPane().removeAll();

        //显示胜利的图片
        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("image/win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }

        //显示走的步数
        JLabel stepCount = new JLabel("步数: " + step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);

        //先加载的图片在上方,后加载的在下方

            //循环添加图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                //随机顺序的二位数组做索引
                int number = arr1[i][j];
                //创建ImageIcon添加图片
                ImageIcon icon = new ImageIcon(path + number + ".jpg");
                //将icon添加到jlabel管理容器
                JLabel jLabel1 = new JLabel(icon);
                //指定图片位置
                jLabel1.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片增加边框
                //0:让图片凹下去
                //1:让图片凸起来
                jLabel1.setBorder(new BevelBorder(1));
                //把管理容器添加到界面
//        this.add(jLabel);
                this.getContentPane().add(jLabel1);
            }

            this.getContentPane().repaint();
        }



        //创建背景图片
        ImageIcon background = new ImageIcon("image\\background.png");
        //添加到管理容器
        JLabel bgd = new JLabel(background);
        //指定图片位置
        bgd.setBounds(40,40,508,560);
        //把管理容器添加到界面中
        this.getContentPane().add(bgd);

    }

    private void initJMenuBar() {
        // 创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上两个两个选项的对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        //创建更换图片
        JMenu changeImage = new JMenu("更换图片");


        //把美女，动物，运动添加到更换图片当中
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);

        //将每一个选项下面的条目添加到选项对象
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        functionJMenu.add(changeImage);

        aboutJMenu.add(accountItem);

        //将选项添加到菜单
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);


        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的标题
        this.setTitle("拼图小游戏单机版1.0");
        //设置界面是否置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中放置,只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    //键盘按下不松
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //清空原本的图片
            this.getContentPane().removeAll();

            //添加完整的图片
            JLabel all = new JLabel(new ImageIcon(path + "/all.jpg"));
            //必须设置位置和宽高
            all.setBounds(83,134,420,420);
            //添加到界面中才能显示
            this.getContentPane().add(all);

            JLabel bgd = new JLabel(new ImageIcon("image/background.png"));
            bgd.setBounds(40,40,508,560);
            this.getContentPane().add(bgd);

            //刷新界面
            this.getContentPane().repaint();
        }

    }

    @Override
    //键盘松开
    public void keyReleased(KeyEvent e) {

        //如果游戏胜利则不能继续游戏
        if (victory()) {
            return;
        }

        //对上下左右进行判断
        //左37,上38,右39,下40
        int code = e.getKeyCode();
        if (code == 37) {
            //判断索引超出范围结束方法
            //y等于3;空白图片无法继续向右移动
            if (y == 3)return;
            System.out.println("向左移动");
            //将空白右方的图片与空白交换
            //图片向左移动,空白图片向右移动,y索引加
            arr1[x][y] = arr1[x][y + 1];
            //交换后原本的位置变成空白
            arr1[x][y + 1] = 0;
            //空白的位置索引发生改变
            y++;
            step++;
            initImage();

        }else if (code == 38) {
            //x等于3;空白图片无法继续向下移动
            if (x == 3)return;
            System.out.println("向上移动");
            //图片向上移动,空白图片向下移动,x索引加
            arr1[x][y] = arr1[x + 1][y];
            arr1[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        }else if (code == 39) {
            //y等于0;空白图片无法继续向左移动
            if (y == 0)return;
            System.out.println("向右移动");
            //图片向右移动,空白图片向左移动,y索引减
            arr1[x][y] = arr1[x][y - 1];
            arr1[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        }else if (code == 40) {
            //x等于0;空白图片无法继续向上移动
            if (x == 0)return;
            System.out.println("向下移动");
            //图片向下移动,空白图片向上移动,x索引减
            arr1[x][y] = arr1[x - 1][y];
            arr1[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        }


        //加载完完整图片松开之后
        if (code == 65){
            initImage();
        }else if (code == 87) {
            arr1 = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();
        }

    }

    //判断现在数组和胜利数组是否一样(判断胜利)
    public boolean victory() {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    //鼠标点击事件
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == replayItem) {
            System.out.println("重新游戏");

            //计步器先清零
            step = 0;
            //再次打乱二维数组
            initdata();
            //重新加载游戏
            initImage();
        }else if (obj == reLoginItem) {
            System.out.println("重新登陆");
            //关闭当前界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();
        }else if (obj == closeItem) {
            System.out.println("关闭游戏");
            System.exit(0);
        }else if (obj == accountItem) {
            System.out.println("二维码");
            //创建弹框对象
            JDialog jDialog = new JDialog();
            //创建管理容器添加图片
            JLabel jLabel = new JLabel(new ImageIcon("image/vx.jpg"));
            //设置jlabel大小
            jLabel.setBounds(0,0,258,258);
            //将图片添加到弹框中
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(344,344);
            //设置弹框置顶
            jDialog.setAlwaysOnTop(true);
            //设置弹框居中
            jDialog.setLocationRelativeTo(null);
            //没有关闭弹窗无法操作
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);
        }

        Random r = new Random();
        if (obj == girl) {
            System.out.println("美女被点击了");
            int number = r.nextInt(13) + 1;
            path = "image\\girl\\girl"+number+"\\";
            //计步器先清零
            step = 0;
            //再次打乱二维数组
            initdata();
            //重新加载游戏
            initImage();
        }else if (obj == animal) {
            System.out.println("动物被点击");
            int number = r.nextInt(8) + 1;
            path = "image\\animal\\animal"+number+"\\";
            //计步器先清零
            step = 0;
            //再次打乱二维数组
            initdata();
            //重新加载游戏
            initImage();
        }else if (obj == sport) {
            System.out.println("运动被点击");
            int number = r.nextInt(10) + 1;
            path = "image\\sport\\sport"+number+"\\";
            //计步器先清零
            step = 0;
            //再次打乱二维数组
            initdata();
            //重新加载游戏
            initImage();
        }
    }
}
