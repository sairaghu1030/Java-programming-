import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.imageio.ImageIO;

public class CursorColorFinderextendsJFrame {

    public static void main(String[] args) {
        String imagePath = "\"C:\\Users\\chait\\Downloads\\Project_Photo.jpg\"";

        try {
            File imageFile = new File(imagePath);
            if (!imageFile.exists()) {
                System.err.println("Error: Input file not found at path: " + imagePath);
                return;
            }

            BufferedImage image = ImageIO.read(imageFile);

            Map<Integer, Integer> colorCounts = findDistinctColors(image);

            List<Map.Entry<Integer, Integer>> sortedColorCounts = new ArrayList<>(colorCounts.entrySet());
            Collections.sort(sortedColorCounts, Comparator.comparingInt(Map.Entry::getValue));

            int numColors = Math.min(50, sortedColorCounts.size());
            Map<Integer, Integer> top50ColorCounts = new HashMap<>();
            for (int i = sortedColorCounts.size() - 1; i >= sortedColorCounts.size() - numColors; i--) {
                Map.Entry<Integer, Integer> entry = sortedColorCounts.get(i);
                top50ColorCounts.put(entry.getKey(), entry.getValue());
            }

            BufferedImage colorSwatches = createColorSwatches(top50ColorCounts);
            File outputImageFile = new File("color_swatches.png");
            ImageIO.write(colorSwatches, "png", outputImageFile);

            System.out.println("Color swatches image created: " + outputImageFile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Map<Integer, Integer> findDistinctColors(BufferedImage image) {
        Map<Integer, Integer> colorCounts = new HashMap<>();

        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                Color pixelColor = new Color(image.getRGB(x, y));
                int rgb = pixelColor.getRGB();

                colorCounts.put(rgb, colorCounts.getOrDefault(rgb, 0) + 1);
            }
        }

        return colorCounts;
    }

    private static BufferedImage createColorSwatches(Map<Integer, Integer> colorCounts) {
        int swatchSize = 50;
        int numColors = colorCounts.size();
        int imageSize = swatchSize * numColors;

        BufferedImage colorSwatches = new BufferedImage(imageSize, swatchSize, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = colorSwatches.getGraphics();

        int x = 0;
        for (int color : colorCounts.keySet()) {
            graphics.setColor(new Color(color));
            graphics.fillRect(x, 0, swatchSize, swatchSize);
            x += swatchSize;
        }

        graphics.dispose();

        return colorSwatches;
    }
}
