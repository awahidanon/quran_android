package com.quran.data.page.provider.size.impl

import android.view.Display

internal class NoOverridePageSizeCalculator(display: Display) : DefaultPageSizeCalculator(display) {

  override fun setOverrideParameter(parameter: String) {
    // override parameter is irrelevant for these pages
  }
}
