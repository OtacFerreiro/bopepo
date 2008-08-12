//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.08.03 at 12:27:56 AM GMT-03:00 
//

package texgit.language;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * 
 * <p>
 * Field � a unidade b�sica de informa��o de um registro, um field est� para um
 * registro assim como uma coluna de banco de dados est� para uma tabela.
 * </p>
 * 
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaField", propOrder = {

})
public class MetaField {

	@XmlElement(name = "Filler")
	protected MetaFiller filler;
	@XmlElement(name = "Formatter")
	protected MetaFormatter formatter;
	@XmlAttribute
	protected Boolean blankAccepted;
	@XmlAttribute
	protected EnumFormats format;
	@XmlAttribute(required = true)
	protected int length;
	@XmlAttribute(required = true)
	protected String name;
	@XmlAttribute
	protected EnumPaddings padding;
	@XmlAttribute
	protected EnumTypes type;
	@XmlAttribute
	protected String value;

	/**
	 * Gets the value of the filler property.
	 * 
	 * @return possible object is {@link MetaFiller }
	 * 
	 */
	public MetaFiller getFiller() {
		return filler;
	}

	/**
	 * Sets the value of the filler property.
	 * 
	 * @param value
	 *            allowed object is {@link MetaFiller }
	 * 
	 */
	public void setFiller(MetaFiller value) {
		this.filler = value;
	}

	/**
	 * Gets the value of the formatter property.
	 * 
	 * @return possible object is {@link MetaFormatter }
	 * 
	 */
	public MetaFormatter getFormatter() {
		return formatter;
	}

	/**
	 * Sets the value of the formatter property.
	 * 
	 * @param value
	 *            allowed object is {@link MetaFormatter }
	 * 
	 */
	public void setFormatter(MetaFormatter value) {
		this.formatter = value;
	}

	/**
	 * Gets the value of the blankAccepted property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isBlankAccepted() {
		if (blankAccepted == null) {
			return false;
		} else {
			return blankAccepted;
		}
	}

	/**
	 * Sets the value of the blankAccepted property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setBlankAccepted(Boolean value) {
		this.blankAccepted = value;
	}

	/**
	 * Gets the value of the format property.
	 * 
	 * @return possible object is {@link EnumFormats }
	 * 
	 */
	public EnumFormats getFormat() {
		return format;
	}

	/**
	 * Sets the value of the format property.
	 * 
	 * @param value
	 *            allowed object is {@link EnumFormats }
	 * 
	 */
	public void setFormat(EnumFormats value) {
		this.format = value;
	}

	/**
	 * Gets the value of the length property.
	 * 
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Sets the value of the length property.
	 * 
	 */
	public void setLength(int value) {
		this.length = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the padding property.
	 * 
	 * @return possible object is {@link EnumPaddings }
	 * 
	 */
	public EnumPaddings getPadding() {
		if (padding == null) {
			return EnumPaddings.WHITE_SPACE_RIGHT;
		} else {
			return padding;
		}
	}

	/**
	 * Sets the value of the padding property.
	 * 
	 * @param value
	 *            allowed object is {@link EnumPaddings }
	 * 
	 */
	public void setPadding(EnumPaddings value) {
		this.padding = value;
	}

	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link EnumTypes }
	 * 
	 */
	public EnumTypes getType() {
		if (type == null) {
			return EnumTypes.STRING;
		} else {
			return type;
		}
	}

	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link EnumTypes }
	 * 
	 */
	public void setType(EnumTypes value) {
		this.type = value;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		if (value == null) {
			return " ";
		} else {
			return value;
		}
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
