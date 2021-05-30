package Tetris;


import java.util.Arrays;

/*
 * 四格方块
 * 属性:
 * 		--cells----四个方块
 * 行为:
 * 		moveLeft()
 * 		moveRight()
 * 		softDrop()
 */
public class Tetromino {
    protected Cell[] cells=new Cell[4];
    /*四格方块向左移动
     * 实际上：就是每个方块向左移动
     */

    public void moveLeft() {//向左移动
        for(int i=0;i<cells.length;i++) {//for循环遍历整个"方块组"的四格方块
            Cell cell = cells[i];//四格方块都要移动
            cell.left();
        }
    }
    public void moveRight() {//向右移动
        for(Cell c:cells) {//此处使用增强for循环也可以
            c.right();
        }
    }
    public void softDrop() {//下落
        for(Cell c:cells) {
            c.drop();
        }
    }

    public void rotateRight() {//向右旋转

        /**
         * 1.将cells[0]作为中心点，获取它的横纵坐标
         * 2.根据笛卡尔坐标系90度旋转公式(顺时针)：
         *   A.x = O.x - O.y + B.y
         *   A.y = O.x + O.y - B.x
         * 求出A.x和A.y，并通过遍历cells[]，再使用setCol()和setRow()方法将A.x和A.y赋值给cell[1],cell[2],cell[3]
         * 由此完成旋转方法
         *
         *   A.x:除中心点外，其他格子旋转后的横坐标   A.y:除中心点外，其他格子旋转后的纵坐标
         *   B.x:除中心点外，其他格子的当前横坐标     B.y:除中心点外，其他格子的当前纵坐标
         *   O.x:中心点的横坐标   O.y：中心点的纵坐标
         */



    }

    public void rotateLeft() {//向左旋转方法

        /**
         * 1.将cells[0]作为中心点，获取它的横纵坐标
         * 2.根据笛卡尔坐标系90度旋转公式(逆时针)：
         *   A.x = O.y + O.x - B.y
         *   A.y = O.y - O.x + B.x
         * 求出A.x和A.y，并通过遍历cells[]，再使用setCol()和setRow()方法将A.x和A.y赋值给cell[1],cell[2],cell[3]
         * 由此完成旋转方法
         *
         *   A.x:除中心点外，其他格子旋转后的横坐标   A.y:除中心点外，其他格子旋转后的纵坐标
         *   B.x:除中心点外，其他格子的当前横坐标     B.y:除中心点外，其他格子的当前纵坐标
         *   O.x:中心点的横坐标   O.y：中心点的纵坐标
         */



    }


    public static Tetromino randomOne() {
//随机生成方块,七种方块形状分别为O,T,I,J,L,S,Z
        Tetromino  t = null;
        int num = (int)(Math.random()*7);
        switch(num) {
            case 0:t = new O();break;
            case 1:t = new T();break;
            case 2:t = new I();break;
            case 3:t = new J();break;
            case 4:t = new L();break;
            case 5:t = new S();break;
            case 6:t = new Z();break;
        }
        return t;
    }

}
