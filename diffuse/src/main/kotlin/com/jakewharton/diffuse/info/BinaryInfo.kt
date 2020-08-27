package com.jakewharton.diffuse.info

import com.jakewharton.diffuse.Apk
import com.jakewharton.diffuse.report.Report

interface BinaryInfo : Report.Factory {
  companion object {
    @JvmStatic
    fun ofApk(
      apk: Apk,
    ): BinaryInfo = ApkInfo(apk)
  }
}
