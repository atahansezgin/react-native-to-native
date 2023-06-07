//
//  ViewController.swift
//  TemplateSwift
//
//  Created by Atahan Sezgin on 7.06.2023.
//

import UIKit
import React

class ViewController: UIViewController {
    
    private let jsCodeLocation = URL(string: "http://localhost:8081/index.bundle?platform=ios")!

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        let rootView = RCTRootView(
            bundleURL: jsCodeLocation,
            moduleName: "HelloMessage",
            initialProperties: ["name":"Salem"]
        )
        self.view = rootView
    }

}

