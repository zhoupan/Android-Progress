package im.delight.android.progress;

/*
 * Copyright (c) delight.im <info@delight.im>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.graphics.Color;
import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.widget.ProgressBar;

public class SimpleProgressDialog extends Dialog {

	public static SimpleProgressDialog show(Context context) {
		SimpleProgressDialog dialog = new SimpleProgressDialog(context);

		dialog.setTitle(null);
		dialog.setCancelable(false);
		dialog.setOnCancelListener(null);

		dialog.addContentView(new ProgressBar(context), new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		dialog.show();

		return dialog;
	}

	public SimpleProgressDialog(Context context) {
		super(context, android.R.style.Theme_Dialog);

		getWindow().getDecorView().setBackgroundColor(Color.TRANSPARENT);
	}

}
