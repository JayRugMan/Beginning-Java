import java.util.Arrays;
public class Combining {
	public static void main(String[] args) {
		int[][] imageData={{100,90,255,80,70,255,60,50},
							         {255,10,5,255,10,5,255,255},
							         {255,255,255,0,255,255,255,75},
							         {255,60,30,0,30,60,255,255}};
		
		//First, we want to crop the image down to a 4x6 image, removing the right 2 columns. Declare and initialize a new 2D array of integers with 4 rows and 6 columns called `newImage`.
		int[][] newImage = new int[4][6];
		
    
		//Now that you have your empty image, use nested **for** loops to copy over the data from the original image to the new image, make sure not to include the cropped out columns.
    for (int row = 0; row < imageData.length; row++) {
      for (int col = 0; col < imageData[row].length; col++) {
        if(col < newImage[0].length) {
          newImage[row][col] = imageData[row][col];
        }
      }
    }

		System.out.println(Arrays.deepToString(newImage));
	
		//You want to decrease the brightness of the new image by 50 units. The way this works is that for every integer in the new 2D array, we will subtract the value by 50. Remember that the value range for the pixel is 0-255, so if the result tries to go below 0, just set it equal to 0.
		int newVal;
    for(int row = 0; row < newImage.length; row++) {
      for(int col = 0; col < newImage[0].length; col++) {
        newVal = newImage[row][col] - 50;
        if(newVal >= 0) {
          newImage[row][col] = newVal;
        } else {
          newImage[row][col] = 0;
        }
      }
    }
		
		System.out.println(Arrays.deepToString(newImage));
	}
}