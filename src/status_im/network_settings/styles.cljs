(ns status-im.network-settings.styles
  (:require-macros [status-im.utils.styles :refer [defstyle defnstyle]])
  (:require [status-im.components.styles :as common]))

(def networks-list
  {:background-color common/color-light-gray})

(defstyle badge-name-text
  {:ios {:font-size      17
         :letter-spacing -0.2}})

(defstyle badge-connected-text
  {:ios {:margin-top     5
         :font-size      14
         :letter-spacing -0.2
         :color          common/color-gray4}})

(defstyle paste-json-text-input
  {:ios {:font-size      17
         :line-height    24
         :letter-spacing -0.2}})

(def connect-button-container
  {:margin-top        8
   :align-items :center
   :margin-bottom     16
   :margin-horizontal 16})

(defstyle connect-button
  {:ios {:height 52
         :width 343
         :align-items :center
         :justify-content :center
         :background-color common/color-light-blue
         :border-radius 8
         :opacity 0.9}})

(defstyle connect-button-label
  {:ios {:font-size 17
         :color common/color-white
         :letter-spacing -0.2}})

(defstyle connect-button-description
  {:ios {:margin-top 8
         :height    20
         :font-size 14
         :color common/color-gray4
         :letter-spacing -0.2}})

(defstyle network-config-container
  {:ios {:height 160
         :margin-top 8
         :padding-top 16
         :padding-left 16
         :margin-horizontal 16
         :border-radius 9
         :opacity 0.9
         :background-color "#eef2f5"}})

(defstyle network-config-text
  {:ios {:opacity 0.8
         :font-size 17
         :color common/color-black
         :line-height 24
         :letter-spacing -0.2}})

(def edit-button-container
  {:margin-top        16
   :align-items :center
   :margin-bottom     16
   :margin-horizontal 16})

(defstyle edit-button
  {:ios {:height 52
         :width 343
         :align-items :center
         :justify-content :center
         :background-color common/color-light-blue-transparent
         :border-radius 8}})

(defstyle edit-button-label
  {:ios {:font-size 17
         :color common/color-light-blue
         :letter-spacing -0.2}})

(defstyle edit-button-description
  {:ios {:margin-top 8
         :text-align :center
         :font-size 14
         :color common/color-gray4
         :letter-spacing -0.2}})

(defnstyle network-icon [connected? size]
  {:ios {:width size
         :height size
         :border-radius (/ size 2)
         :background-color (if connected? "#729ae6" "#eef2f5")
         :align-items :center :justify-content :center}})

(defstyle network-badge
  {:ios {:height 88
         :padding-left 16
         :flex-direction :row
         :align-items :center}})

(defstyle network-item
  {:ios {:height 64
         :flex-direction :row
         :background-color :white
         :align-items :center
         :padding-horizontal 16}})

(defstyle network-item-name-text
  {:ios {:font-size 17
         :letter-spacing -0.2
         :line-height 20}})

(defstyle network-item-connected-text
  {:ios {:font-size 14
         :letter-spacing -0.2
         :color "#939ba1"}})
