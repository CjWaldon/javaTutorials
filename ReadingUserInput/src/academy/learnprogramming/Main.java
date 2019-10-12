package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your birth year: ");
//
//		boolean hasNextInt = scanner.hasNextInt();
//		if(hasNextInt){
//			int yearOfBirth = scanner.nextInt();
//			scanner.nextLine();// handle nextline character
//			System.out.println("Enter your name: ");
//			String name = scanner.nextLine();
//
//			int age = 2019 - yearOfBirth;
//			System.out.println("your name is: "+name+", and you are "+age+" years old");
//		}else{
//			System.out.println("Unable to parse year of birth.");
//		}
//		scanner.close();
	int buckets= getBucketCount(3.4, 2.1, 1.5, 2);
		System.out.println(buckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
		if(width <= 0|| height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){return -1;}
		double areaToPaint = height*width;
		double areaCanCover = areaPerBucket*extraBuckets;
		int cnt = 0;
		if(areaCanCover < areaToPaint)
		while(areaToPaint > areaCanCover){
			cnt++;
			areaCanCover += areaPerBucket;
		}
		return cnt;
	}

	public static int getBucketCount(double width, double height, double areaPerBucket){
		if(width <= 0|| height <= 0 || areaPerBucket <= 0){return -1;}
		double areaToPaint = height*width;
		double areaCanCover = 0.0;
		int cnt = 0;
		if(areaCanCover < areaToPaint) {
			while (areaToPaint > areaCanCover) {
				cnt++;
				areaCanCover += areaPerBucket;
			}
		}
		return cnt;
	}

	public static int getBucketCount(double area, double areaPerBucket){
		if(area <= 0 || areaPerBucket <= 0){return -1;}

		double areaCanCover = 0.0;
		int cnt = 0;
		if(areaCanCover < area) {
			while (area > areaCanCover) {
				cnt++;
				areaCanCover += areaPerBucket;
			}
		}
		return cnt;
	}
}
