
public class Array08_3차원배열 {
	public static void main(String[] args) {
		// 2x2 이미지의 RGB 값 저장을 위한 3차원 배열 생성
		int[][][] image = new int[2][2][3];
		// 각 픽셀의 RGB 값 할당
		// 픽셀 (0, 0)
		image[0][0][0] = 243; // Red
		image[0][0][1] = 103; // Green
		image[0][0][2] = 224; // Blue
		// 픽셀 (0, 1)
		image[0][1][0] = 255; // Red
		image[0][1][1] = 159; // Green
		image[0][1][2] = 67; // Blue
		// 픽셀 (1, 0)
		image[1][0][0] = 21; // Red
		image[1][0][1] = 210; // Green
		image[1][0][2] = 211; // Blue
		// 픽셀 (1, 1)
		image[1][1][0] = 84; // Red
		image[1][1][1] = 160; // Green
		image[1][1][2] = 255; // Blue
		// 이미지의 RGB 값 출력
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[i].length; j++) {
				System.out.println("Pixel (" + i + ", " + j + ") - " + "R: " + image[i][j][0] + ", " + "G: "
						+ image[i][j][1] + ", " + "B: " + image[i][j][2]);
			}
		}

	}
}
