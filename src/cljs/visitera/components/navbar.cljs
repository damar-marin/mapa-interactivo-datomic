(ns visitera.components.navbar
  (:require
   [reagent.core :as r]))

(defn navbar []
  (r/with-let [expanded? (r/atom false)]
    [:nav.navbar {:style {:background-color "#7b34c8"}}
     [:div.container
      [:div.navbar-brand
       [:a.navbar-item {:href "/" :style {:font-weight :bold :color "white"}} "Damar Marín"]
       [:span.navbar-burger.burger
        {:data-target :nav-menu
         :on-click #(swap! expanded? not)
         :class (when @expanded? :is-active)}
        [:span] [:span] [:span]]]
      [:div#nav-menu.navbar-menu
       {:class (when @expanded? :is-active)}
       [:div.navbar-end
        [:a.navbar-item {:href "/logout" :style {:color "white"}} "Logout"]]]]]))
