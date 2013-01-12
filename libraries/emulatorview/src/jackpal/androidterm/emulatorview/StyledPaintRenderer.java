package jackpal.androidterm.emulatorview;

public class StyledPaintRenderer extends PaintRenderer {
	public StyledPaintRenderer(int fontSize, ColorScheme scheme, int[] colors) {
		super(fontSize, scheme);
		
		if ((colors != null) && (colors.length == 259))
		this.mPalette = colors;
	}
}