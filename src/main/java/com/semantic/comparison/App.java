package com.semantic.comparison;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class App {
	// meenakshi
	public static void main(String[] args) throws IOException {
		String folderPath1 = "C:\\Users\\user\\eclipse-workspace\\semantic-comparator\\text file";
		String folderPath2 = "C:\\Users\\user\\eclipse-workspace\\semantic-comparator\\text file1";

		List<Path> filesInFolder1 = FileReaderUtil.listFilesInFolder(folderPath1);
		List<Path> filesInFolder2 = FileReaderUtil.listFilesInFolder(folderPath2);

		for (Path file1 : filesInFolder1) {
			for (Path file2 : filesInFolder2) {
				compareFiles(file1.toString(), file2.toString());
			}
		}
	}

	private static void compareFiles(String filePath1, String filePath2) throws IOException {
		List<String> lines1 = FileReaderUtil.readFile(filePath1);
		List<String> lines2 = FileReaderUtil.readFile(filePath2);

		String content1 = String.join(" ", lines1);
		String content2 = String.join(" ", lines2);

		// Tokenize
		List<String> tokens1 = TextPreprocessor.tokenize(content1);
		List<String> tokens2 = TextPreprocessor.tokenize(content2);

		// Vectorize
		Map<String, Integer> vector1 = Vectorizer.vectorize(tokens1);
		Map<String, Integer> vector2 = Vectorizer.vectorize(tokens2);

		// Compute Cosine Similarity
		double similarity = CosineSimilarity.cosineSimilarity(vector1, vector2);

		System.out.println("Similarity between "
				+ "C:\\\\Users\\\\user\\\\eclipse-workspace\\\\semantic-comparator\\\\text file" + " and "
				+ "C:\\Users\\user\\eclipse-workspace\\semantic-comparator\\text file1" + ": " + similarity);
	}
}
