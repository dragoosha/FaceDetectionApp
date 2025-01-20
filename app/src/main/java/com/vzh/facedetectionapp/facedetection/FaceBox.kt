package com.vzh.facedetectionapp.facedetection

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PointF
import android.graphics.Rect
import com.google.mlkit.vision.face.Face

class FaceBox(
    overlay: FaceBoxOverlay,
    private val face: Face,
    private val imageRect: Rect
) : FaceBoxOverlay.FaceBox(overlay){

    private val paint = Paint().apply {
        color = Color.RED
        style = Paint.Style.STROKE
        strokeWidth = 6.0F
    }

    override fun draw(canvas: Canvas?) {
        val rect = getBoxRect(
            imageRectWidth = imageRect.width().toFloat(),
            imageRectHeight = imageRect.height().toFloat(),
            faceBoundingBox = face.boundingBox
        )

        canvas?.drawRect(rect, paint)

        val paintContour = Paint().apply {
            color = Color.GREEN
            style = Paint.Style.STROKE
            strokeWidth = 3f
        }
        face.allContours.forEach { contour ->
            val path = Path()
            contour.points.forEachIndexed { index, point ->
                val transformedPoint = transformPoint(PointF(point.x, point.y), imageRect.width().toFloat(), imageRect.height().toFloat())
                if (index == 0) {
                    path.moveTo(transformedPoint.x, transformedPoint.y)
                } else {
                    path.lineTo(transformedPoint.x, transformedPoint.y)
                }
            }
            canvas?.drawPath(path, paintContour)
        }
    }


}
