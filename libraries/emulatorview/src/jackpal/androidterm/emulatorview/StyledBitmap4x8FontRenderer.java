package jackpal.androidterm.emulatorview;

import android.content.res.Resources;

public class StyledBitmap4x8FontRenderer extends Bitmap4x8FontRenderer {
	public StyledBitmap4x8FontRenderer(Resources resources, ColorScheme scheme, int[] colors) {
		super(resources, scheme);

		if ((colors != null) && (colors.length == 259))
			this.mPalette = colors;
		
	}
}