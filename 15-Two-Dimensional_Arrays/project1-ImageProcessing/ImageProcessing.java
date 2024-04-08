import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;
import javax.imageio.ImageIO;
public class ImageProcessing {
	public static void main(String[] args) {
    String baseDir = "/home/jasonhardman/Documents/Beginning-Java/15-Two-Dimensional_Arrays/project1-ImageProcessing";
    //JH String baseDir = "/home/jason/Documents/CodingProjects/Beginning-Java/15-Two-Dimensional_Arrays/project1-ImageProcessing";
    //JH String baseDir = ".";
	  // The provided images are apple.jpg, flower.jpg, and kitten.jpg
		int[][] imageData = imgToTwoD(baseDir + "/apple.jpg");
    // Or load your own image using a URL!
		//int[][] imageData = imgToTwoD("https://content.codecademy.com/projects/project_thumbnails/phaser/bug-dodger.png");
		//viewImageData(imageData);

    int[][] trimmed = trimBorders(imageData, 60);
		twoDToImage(trimmed, baseDir + "/trimmed_apple.jpg");

    int[][] negative = negativeColor(imageData);
    twoDToImage(negative, baseDir + "/negative_apple.jpg");

    int[][] hStretched = stretchHorizontally(imageData);
    twoDToImage(hStretched, baseDir + "/h_stretched_apple.jpg");

    int[][] vShrunk = shrinkVertically(imageData);
    twoDToImage(vShrunk, baseDir + "/v_shrunk_apple.jpg");

    int[][] inverted = invertImage(imageData);
    twoDToImage(inverted, baseDir + "/inverted_apple.jpg");

    int[][] filtered = colorFilter(imageData, -75, 30, -30);
    twoDToImage(filtered, baseDir + "/filtered_apple.jpg");

    // int[][] allFilters = stretchHorizontally(shrinkVertically(colorFilter(negativeColor(trimBorders(invertImage(imageData), 50)), 200, 20, 40)));
		// Painting with pixels
	}
	// Image Processing Methods
	public static int[][] trimBorders(int[][] imageTwoD, int pixelCount) {
		// Example Method
		if (imageTwoD.length > pixelCount * 2 && imageTwoD[0].length > pixelCount * 2) {
			int[][] trimmedImg = new int[imageTwoD.length - pixelCount * 2][imageTwoD[0].length - pixelCount * 2];
			for (int i = 0; i < trimmedImg.length; i++) {
				for (int j = 0; j < trimmedImg[i].length; j++) {
					trimmedImg[i][j] = imageTwoD[i + pixelCount][j + pixelCount];
				}
			}
			return trimmedImg;
		} else {
			System.out.println("Cannot trim that many pixels from the given image.");
			return imageTwoD;
		}
	}
	public static int[][] negativeColor(int[][] imageTwoD) {
		// Creates a negative image by subtracting RGB values from original image from 255 for negative image
    int[][] negativeImage = new int[imageTwoD.length][imageTwoD[0].length];
    for(int i =0; i < imageTwoD.length; i++) {
      for(int j=0; j < imageTwoD[i].length; j++) {
        int[] rgba = getRGBAFromPixel(imageTwoD[i][j]);
        rgba[0] = 255 - rgba[0];
        rgba[1] = 255 - rgba[1];
        rgba[2] = 255 - rgba[2];
        negativeImage[i][j] = getColorIntValFromRGBA(rgba);
      }
    }
		return negativeImage;
	}
	public static int[][] stretchHorizontally(int[][] imageTwoD) {
		// Stretches the image horizontally by doubling row-length and duplicating each pixel along that plane
    int[][] stretchedImg = new int[imageTwoD.length][imageTwoD[0].length * 2];
    int doubleTrack = 0;
    for(int i=0; i < imageTwoD.length; i++) {
      for(int j=0; j < imageTwoD[0].length; j++) {
        doubleTrack = j*2;
        stretchedImg[i][doubleTrack] = imageTwoD[i][j];
        stretchedImg[i][doubleTrack+1] = imageTwoD[i][j];
      }
    }
		return stretchedImg;
	}
	public static int[][] shrinkVertically(int[][] imageTwoD) {
		// Shrinks image by only transfering every other row of the original image
    int[][] shrunkImage = new int[imageTwoD.length/2][imageTwoD[0].length];
    for(int i = 0; i < imageTwoD[0].length; i++) {  // iterate through each column, or element of the rows
      for(int j = 0; j < imageTwoD.length-1; j += 2) {  // iterate through every other row
        shrunkImage[j/2][i] = imageTwoD[j][i];
      }
    }
		return shrunkImage;
	}
	public static int[][] invertImage(int[][] imageTwoD) {
		// Invert the image
		int[][] invertedImage = new int[imageTwoD.length][imageTwoD[0].length];
		for(int i = 0; i < imageTwoD.length; i++) {
			for(int j = 0; j < imageTwoD[0].length; j++) {
				invertedImage[i][j] = imageTwoD[(imageTwoD.length-1)-i][(imageTwoD[0].length-1)-j];
			}
		}
		return invertedImage;
	}
	public static int[][] colorFilter(int[][] imageTwoD, int redChangeValue, int greenChangeValue, int blueChangeValue) {
		// Add a color filter
		int[][] filteredImage = new int[imageTwoD.length][imageTwoD[0].length];
		for(int i = 0; i < imageTwoD.length; i++) {
			for(int j = 0; j < imageTwoD[0].length; j++) {

				// Extract color from pixels
				int[] rgba = getRGBAFromPixel(imageTwoD[i][j]);
				rgba[0] = rgba[0] + redChangeValue;
				rgba[1] = rgba[1] + greenChangeValue;
				rgba[2] = rgba[2] + blueChangeValue;

				// Correct each new value to remain within range of 0 and 255
				for(int k = 0; k < (rgba.length - 1); k++) {
					if(rgba[k] < 0) {
						rgba[k] = 0;
					} else if(rgba[k] > 255) {
						rgba[k] = 255;
					}
				}

				// Add new pixel to final image
				filteredImage[i][j] = getColorIntValFromRGBA(rgba);
			}
		}
		return filteredImage;
	}
	// Painting Methods
	public static int[][] paintRandomImage(int[][] canvas) {
		// TODO: Fill in the code for this method
		return null;
	}
	public static int[][] paintRectangle(int[][] canvas, int width, int height, int rowPosition, int colPosition, int color) {
		// TODO: Fill in the code for this method
		return null;
	}
	public static int[][] generateRectangles(int[][] canvas, int numRectangles) {
		// TODO: Fill in the code for this method
		return null;
	}
	// Utility Methods
	public static int[][] imgToTwoD(String inputFileOrLink) {
		try {
			BufferedImage image = null;
			if (inputFileOrLink.substring(0, 4).toLowerCase().equals("http")) {
				URL imageUrl = new URL(inputFileOrLink);
				image = ImageIO.read(imageUrl);
				if (image == null) {
					System.out.println("Failed to get image from provided URL.");
				}
			} else {
				image = ImageIO.read(new File(inputFileOrLink));
			}
			int imgRows = image.getHeight();
			int imgCols = image.getWidth();
			int[][] pixelData = new int[imgRows][imgCols];
			for (int i = 0; i < imgRows; i++) {
				for (int j = 0; j < imgCols; j++) {
					pixelData[i][j] = image.getRGB(j, i);
				}
			}
			return pixelData;
		} catch (Exception e) {
			System.out.println("Failed to load image: " + e.getLocalizedMessage());
			return null;
		}
	}
	public static void twoDToImage(int[][] imgData, String fileName) {
		try {
			int imgRows = imgData.length;
			int imgCols = imgData[0].length;
			BufferedImage result = new BufferedImage(imgCols, imgRows, BufferedImage.TYPE_INT_RGB);
			for (int i = 0; i < imgRows; i++) {
				for (int j = 0; j < imgCols; j++) {
					result.setRGB(j, i, imgData[i][j]);
				}
			}
			File output = new File(fileName);
			ImageIO.write(result, "jpg", output);
		} catch (Exception e) {
			System.out.println("Failed to save image: " + e.getLocalizedMessage());
		}
	}
	public static int[] getRGBAFromPixel(int pixelColorValue) {
		Color pixelColor = new Color(pixelColorValue);
		return new int[] { pixelColor.getRed(), pixelColor.getGreen(), pixelColor.getBlue(), pixelColor.getAlpha() };
	}
	public static int getColorIntValFromRGBA(int[] colorData) {
		if (colorData.length == 4) {
			Color color = new Color(colorData[0], colorData[1], colorData[2], colorData[3]);
			return color.getRGB();
		} else {
			System.out.println("Incorrect number of elements in RGBA array.");
			return -1;
		}
	}
	public static void viewImageData(int[][] imageTwoD) {
		if (imageTwoD.length > 3 && imageTwoD[0].length > 3) {
			int[][] rawPixels = new int[3][3];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					rawPixels[i][j] = imageTwoD[i][j];
				}
			}
			System.out.println("Raw pixel data from the top left corner.");
			System.out.print(Arrays.deepToString(rawPixels).replace("],", "],\n") + "\n");
			int[][][] rgbPixels = new int[3][3][4];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					rgbPixels[i][j] = getRGBAFromPixel(imageTwoD[i][j]);
				}
			}
			System.out.println();
			System.out.println("Extracted RGBA pixel data from top the left corner.");
			for (int[][] row : rgbPixels) {
				System.out.print(Arrays.deepToString(row) + System.lineSeparator());
			}
		} else {
			System.out.println("The image is not large enough to extract 9 pixels from the top left corner");
		}
	}
}