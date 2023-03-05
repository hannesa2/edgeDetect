# Usage
Out of the box it uses OpenCV.

1. Start **startActivityForResult** from your activity
```
startActivityForResult(new Intent(this, ScanActivity.class), REQUEST_CODE);
```
2. Get a file path for cropped image on **onActivityResult**
```
String filePath = data.getExtras().getString(ScanConstants.SCANNED_RESULT);
Bitmap baseBitmap = ScanUtils.decodeBitmapFromFile(filePath, ScanConstants.IMAGE_NAME);
```
3. Display the image using **TouchImageView**
```
<com.ortiz.touchview.TouchImageView
        android:id="@+id/scanned_image"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scaleType="center" />
```

# License
```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

## License PDF
```
https://github.com/itext/itext7/blob/develop/LICENSE.md

This program is offered under a commercial and under the AGPL license.
For commercial licensing, contact us at https://itextpdf.com/sales.  For AGPL licensing, see below.

AGPL licensing:
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.

```

