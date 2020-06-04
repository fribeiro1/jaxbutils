/*
 * Copyright 2012 Upic
 * 
 * This file is part of JAXB Utils.
 *
 * JAXB Utils is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * JAXB Utils is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with JAXB Utils. If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.upic.jaxb.converters;

import java.math.BigDecimal;

import javax.xml.bind.DatatypeConverter;

public class DoubleConverter {

	public static Double parseDouble(String value) {
		return DatatypeConverter.parseDecimal(value).doubleValue();
	}

	public static String printDouble(Double value) {
		return DatatypeConverter.printDecimal(new BigDecimal(value));
	}

}