//        Given a dictionary, a method to do lookup in dictionary and a M x N board
//        where every cell has one character. Find all possible words that can be formed
//        by a sequence of adjacent characters. Note that we can move to any of 8 adjacent characters,
//        but a word should not have multiple instances of same cell.

package Backtracking;

import java.util.ArrayList;

public class Boggle {
    public static void main(String[] args) {
        char boggle[][] = { { 'G', 'I', 'Z' },
                            { 'U', 'E', 'K' },
                            { 'Q', 'S', 'E' } };

        System.out.println("Following words of dictionary are present :");
        findWords(boggle);
    }

    static final String dictionary[] = { "GEEKS", "FOR", "QUIZ", "GUQ", "EE" };
    static final int M = 3, N = 3;

    static boolean isWord(String word) {
        // Linearly search all words
        for (int i = 0; i < dictionary.length ; i++)
            if (word.equals(dictionary[i]))
                return true;
        return false;
    }

    static void findWordsUtil(char boggle[][], boolean visited[][], int i, int j, String word) {

        // Mark current cell as visited and append current character to word
        visited[i][j] = true;
        word = word + boggle[i][j];

        if (isWord(word)){
            System.out.println(word);
        }

        // Traverse 8 adjacent cells of boggle[i][j]
        for (int row = i - 1; row <= i + 1 && row < M; row++){
            for (int col = j - 1; col <= j + 1 && col < N; col++) {
                if (row >= 0 && col >= 0 && !visited[row][col]) {
                    findWordsUtil(boggle, visited, row, col, word);
                }
            }
        }

        // Erase current character from string and mark visited of current cell as false
        word = "" + word.charAt(word.length() - 1);
        visited[i][j] = false;
    }


    static void findWords(char boggle[][]) {
        // Mark all characters as not visited
        boolean visited[][] = new boolean[M][N];

        String word = "";

        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++) {
                findWordsUtil(boggle, visited, i, j, word);
            }
        }
    }

}
