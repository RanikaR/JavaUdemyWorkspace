package codingexercises;

// Coding Exercise 28: Paint Job

public class PaintJob {

	public static void main(String[] args) {
		System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
		
		System.out.println(getBucketCount(-3.4, 2.1, 1.5));
		System.out.println(getBucketCount(3.4, 2.1, 1.5));
		System.out.println(getBucketCount(7.25, 4.3, 2.35));
		
		System.out.println(getBucketCount(3.4, 1.5));
		System.out.println(getBucketCount(6.26, 2.2));
		System.out.println(getBucketCount(3.26, 0.75));

	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		
		// validates input
		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}
		
		// area of the wall being painted
		double wallArea = width * height; 
		
		// number of paint buckets needed
		int totalBuckets = (int) Math.ceil(wallArea / areaPerBucket);
		
		// actual number of paint buckets to buy
		int toBuy = totalBuckets - extraBuckets;
		
		return toBuy;
		
	}
	
	public static int getBucketCount(double width, double height, double areaPerBucket) {
		
		// validates input
		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		
		// area of the wall being painted
		double wallArea = width * height; 
		
		// number of paint buckets needed
		int totalBuckets = (int) Math.ceil(wallArea / areaPerBucket);
		
		return totalBuckets;
		
		
	}
	
	public static int getBucketCount(double area, double areaPerBucket) {
		// validates input
		if (area <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		
		int totalBuckets = (int) Math.ceil(area / areaPerBucket);
		
		return totalBuckets;
	}

}
