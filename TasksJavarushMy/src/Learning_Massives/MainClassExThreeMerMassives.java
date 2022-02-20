package Learning_Massives;
// Трёхмерные массивы

public class MainClassExThreeMerMassives {
    public static void main(String[] args) {

        //создаём трёхмерный массив, состоящий из двух двухмерных массивов
        int[][][] threeDimArr = new int[2][][];
//создаём первый двумерный массив трёхмерного массива размерностью 5х2
        threeDimArr[0] = new int[5][2];
//создаём второй двумерный массив трёхмерного массива размерностью 1х1
        threeDimArr[1] = new int[1][1];

//Ещё пример трёхмерного массива:
        int[][][]threeDimArray = {{{18, 28, 18,28}, {45, 90, 45, 0}},{{7, 125, 500, 5}, {0, 11, 25, 30}}, {{81, 17, 19, 55}, {1, 7, 38, 11}}};

// МНОГОЭТАЖНАЯ ПАРКОВКА. Каждый этаж можно считать двумерным массивом, а паркоместо — конкретным элементом трёхмерного массива.
// Элемент такого массива можно представить типом boolean со значением false, если место свободно и true, если место занято.
//задаем булев трёхмерный массив. На этой парковке есть 3 этажа, на каждом из которых можно поместить 2х5 = 10 машин. По умолчанию все ячейки пусты (false)
        boolean[][][] parkingLot = new boolean[3][2][5];
//приехало две машины и припарковались на нулевом этаже в ячейке [1][0] и [1][3]
        parkingLot[0][1][0] = true; //Приехала первая машина
        parkingLot[0][1][3] = true; //Приехала вторая машина

//Выведем массив в консоль
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print("ParkingPlace[" + i + "][" + j + "][" + k + "] = " + parkingLot[i][j][k] + "\t");
                }
                System.out.println();
            }
        }

    }
}
