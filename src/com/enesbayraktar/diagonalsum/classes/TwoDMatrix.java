package com.enesbayraktar.diagonalsum.classes;

public class TwoDMatrix {
    int row;
    int column;
    int[][] array;

    DiagonalSum diagonal;

    /**
     * İki Boyutlu Matrix sınıfı
     *
     * Bu sınıfı oluşrurken matrixin sutün, satır, kendisini ve diagonal toplamda bize yardımcı olucak olan sınıfı değer olarak alan elemanlar oluşturdum.
     *
     * Sınıfın kurucusunda matrixin x ve y boyutlarını baz alan iki değişken atadım. Bu değişkenler sütun ve satır sayısı olarak sınıfın kendisine eklenirken
     * iki boyutlu matrixi bu değerlerden oluşturup dize değerine atadım. Bu dize değerini de yardımcı sınıf olan DiagonalSum'ın kurucusuna argüman olarak gönderip
     * yeni bu matrix için bir DiagonalSum sınıfı türettim.
     *
     * addRow metoduyla beraber bu matrixe String dizesi şeklinde gelen değerleri ekledim.
     *
     * sumDiagonalFromLeft ve sum..Right metodları ile de DiagonalSum sınıfını kullanarak. Oluşturduğumuz matrixin diagonal toplamlarını hesaplayıp döndüren fonksiyonları döndürdüm.
     */

    public TwoDMatrix(int sizeX, int sizeY) {
        this.row = sizeX;
        this.column = sizeY;
        this.array = new int [sizeX][sizeY];
        this.diagonal = new DiagonalSum(this.array);
    }

    public void addRow(int column, String[] values) {
        for (int i = 0; i < this.row; i++) {
            this.array[column][i] = Integer.parseInt(values[i]);
        }
    }

    public int sumDiagonalFromLeft() {
        return this.diagonal.left();
    }

    public int sumDiagonalFromRight() {
        return this.diagonal.right();
    }

    private class DiagonalSum {
        int [][] diagonalArray;

        /**
         * Diagonal Toplam sınıfı
         *
         * Bu sınıfta diagonal toplamı alınacak olan dizeyi eleman olarak oluşturdum ve kurucuda atanmasını şart koştum.
         *
         * left ve right metodunda iki boyutlu matrixi içe içe for döngüsü ile işledim.
         *
         * left metodunda bu işlemeyi yaparken satır sayısının sütun sayısında eşit olduğu durumda total değişkeniyle topladım.
         * böylelikle soldan sağa olan diagonal toplamı bulmuş oldum.
         *
         * Örnek:
         * 1 1 2
         * 3 4 6
         * 7 8 9
         *
         * Matriximiz olsun, bu matrixi işlerken işlenen satır indisi ve işlenen sütun indisi arasındaki toplam ilişki left metodunda alttaki şekildedir.
         *
         * r: 0 c: 0 / birinci diagonal değer
         * r: 0 c: 1
         * r: 0 c: 2
         * r: 1 c: 0
         * r: 1 c: 1 / ikinci diagonal değer
         * r: 1 c: 2
         * r: 2 c: 0
         * r: 2 c: 1
         * r: 2 c: 2 / üçüncü diagonal değer
         *
         * Soldan sağa diagonal toplam bu üç değerin birbiriyle toplanmasıdır.
         *
         * right metodunda bu işlemeyi yaparken işlenen satır indisi ve işlenen sütun indisinin toplamının, matrix'in satır uzunluğunun 1 eksiğine eşit olup olmadığını sorguladım.
         * bu durumda alttaki şekildeki gibi seçimlerimi yapabildim.
         *
         * r: 0 c: 0 	r + c: 0 length: 2
         * r: 0 c: 1 	r + c: 1 length: 2
         * r: 0 c: 2 	r + c: 2 length: 2 / birinci diagonal değer
         * r: 1 c: 0    r + c: 1 length: 2
         * r: 1 c: 1    r + c: 2 length: 2 / ikinci diagonal değer
         * r: 1 c: 2    r + c: 3 length: 2
         * r: 2 c: 0    r + c: 2 length: 2 / üçüncü diagonal değer
         * r: 2 c: 1    r + c: 3 length: 2
         * r: 2 c: 2    r + c: 4 length: 2
         *
         * Sağdan sola diagonal toplam bu üç değerin birbiriyle toplanmasıdır.
         */

        public DiagonalSum(int[][] array) {
            this.diagonalArray = array;
        }

        public int left() {
            int total = 0;
            for (int r = 0; r < this.diagonalArray.length; r++) {
                for (int c = 0; c < this.diagonalArray[0].length; c++) {
                    if (r == c) {
                        total += this.diagonalArray[r][c];
                    }
                }
            }
            return total;
        }

        public int right() {
            int total = 0;
            for (int r = 0; r < this.diagonalArray.length; r++) {
                for (int c = this.diagonalArray[0].length - 1; c >= 0; c--) {
                    if (r + c == this.diagonalArray.length - 1) {
                        total += this.diagonalArray[r][c];
                    }
                }
            }
            return total;
        }
    }
}