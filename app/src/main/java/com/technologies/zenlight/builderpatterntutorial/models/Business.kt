package com.technologies.zenlight.builderpatterntutorial.models

import android.os.Build

class Business {

    lateinit var address: String
    lateinit var description: String
    lateinit var businessName: String
    lateinit var startDate: String
    lateinit var number: String
    lateinit var owner: String

    constructor(
        address: String,
        description: String,
        businessName: String,
        number: String,
        startDate: String,
        owner: String
    ) {
        this.address = address
        this.description = description
        this.businessName = businessName
        this.number = number
        this.startDate = startDate
        this.owner = owner
    }

    constructor(builder: Builder) {
        this.address = builder.address
        this.description = builder.description
        this.businessName = builder.businessName
        this.number = builder.number
        this.startDate = builder.startDate
        this.owner = builder.owner
    }

    class Builder {

        internal var address: String = ""
            private set

        internal var description: String = ""
            private set

        internal var businessName: String = ""
            private set

        internal var startDate: String = ""
            private set

        internal var number: String = ""
            private set

        internal var owner: String = ""
            private set


        fun setAddress(address: String): Builder {
            this.address = address
            return this
        }

        fun setDescription(description: String): Builder {
            this.description = description
            return this
        }

        fun setBusinessName(name: String): Builder {
            this.businessName = name
            return this
        }

        fun setStartDate(date: String): Builder {
            this.startDate = date
            return this
        }

        fun setNumber(number: String): Builder {
            this.number = number
            return this
        }

        fun setOwner(owner: String): Builder {
            this.owner = owner
            return this
        }

        fun build(): Business {
            return Business(
                this
            )
        }
    }
}